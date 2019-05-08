package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class back9095 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		int max=0;
		int[] input = new int[n+1];
		for(int i=0;i<n;i++){
			input[i]=Integer.parseInt(br.readLine());
			if(max<input[i])
				max=input[i];
		}

		int[] result = new int[max+1];
		result[0]=1;
		result[1]=1;
		result[2]=2;
		
		for(int i=3;i<=max ;i++){
			result[i]=result[i-1]+result[i-2]+result[i-3];
		}
		
		for(int i=0;i<n;i++){
			bw.write(String.valueOf(result[input[i]]));
			bw.newLine();
		}
		
		bw.flush();
		
	}

}
