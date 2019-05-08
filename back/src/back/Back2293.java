package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Back2293 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int[] arr = new int[10001]; 
		int[] coin=new int[n];
		int len=coin.length;
		
		for(int i=0;i<n;i++) {
			coin[i]=Integer.parseInt(br.readLine());
			
		}
		arr[0]=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=k;j++) {
				if(j>=coin[i]) {
					arr[j]+=arr[j-coin[i]];
				}				
			}
		}		 
		
		bw.write(String.valueOf(arr[k]));
		bw.flush();
		
		
		
		
		
		
	}
	

}
