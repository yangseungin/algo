package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class back2902 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String result="";
		
		
		char[] arr=br.readLine().toCharArray();
		result+=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]=='-'){
				result+=arr[i+1];
			}
		}
		bw.write(String.valueOf(result));
		bw.flush();
		
		
	}

}
