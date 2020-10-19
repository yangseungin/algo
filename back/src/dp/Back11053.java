package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Back11053 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int count=0;
		int[] input = new int[n];
		int[] result = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<n;i++){
			input[i]=Integer.parseInt(st.nextToken());
		}
		result[0]=input[0];
		
		for(int i=1;i<n;i++){
			
			if(input[i]>result[count]){
				result[++count]=input[i];
			}else{
				for(int j=0;j<=count;j++){
	                if(input[i]<=result[j]){
	                    result[j]=input[i];
	                    break;
	                }
	            }
			}
		}
		
		
		bw.write(String.valueOf(count+1));
		bw.flush();
		
		
	}

}
