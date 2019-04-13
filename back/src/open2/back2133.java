package open2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class back2133 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		
		/* 2	3
		 * 4	3*2 x 3*2 + 2고유
		   6	3*2 x 3*4 + 3*4 고유 x 3*2 + 3*6고유 
		   8	3*2 x 3*6 + 3*4 고유 x 3*4 + 3*6고유 x 3*2 +3*6고유
		*/
		
		int n= Integer.parseInt(br.readLine());		
		bw.write(String.valueOf(tiling(n)));
		bw.flush();
		
		
	}
	public static int tiling(int n) {
		int answer=0;
		
		if(n%2==1) {
			return 0;
		}
		else if(n==0) {
			return 1;
		}
		else if(n==2) {
			return 3; //3*2 는 3 고정
		}		
		
		answer = 3*tiling(n-2);// 첫케이스 그다음부턴 반복으로 고유 더하기
		for(int i=0;i<=n-4;i++) {
			answer+= 2*tiling(i);
		}
				
		return answer;
	}

}
