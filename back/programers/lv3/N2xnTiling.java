package lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N2xnTiling {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//재귀로 풀면 타임아웃날듯 
		//dp ㄱ
//		1	1,0				1
//		2	2,0	0,2			2
//		3	3,0	1,2	1,2		3
//		4	4,0	2,2 x 3	0,4		5
//		5	5,,0	3,2 x4	1,4 x3		8
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(solution(n)));
		bw.flush();

		
	}
	public static int solution(int n){
		int answer=0;
		int[] arr =new int[60001];
		arr[1]=1;
		arr[2]=2;
		for(int i=3;i<=n;i++) {
			arr[i]=(arr[i-1]+arr[i-2])%1000000007;
		}
		answer=arr[n];
		
		
		return answer;
		
	}

}
