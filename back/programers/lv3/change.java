package lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class change {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		/*	
		 * 		1	2	3	4	5	6	7	8	9	10
		 * 0	1	0	0	0	0	0	0	0	0	0
		 * 1	1	1	1	1	1	1	1	1	1	1
		 * 2	1	2	2	3	3	4	4	5	5	6
		 * 5	1	2	2	3	4	5	6	7	8	10	
		
*/		
		
		//int n=Integer.parseInt(br.readLine());
		int n=5;
		int[] money = {1,2,5};
		bw.write(String.valueOf(solution(n,money)));
		bw.flush();
		 
		
	
	}
	public static int solution(int n,int[] money){
		int[] arr = new int[1000001];
		int len= money.length;
		
		arr[0]=1;
		for(int i=0;i<len;i++) {
			for(int j=0;j<=n;j++) {
				if(j>=money[i]) {
					arr[j]+=arr[j-money[i]]%1000000007;
				}				
			}
		}		
		
		return arr[n];
	}

}
