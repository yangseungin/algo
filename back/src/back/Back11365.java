package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back11365 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str="";

		while(true){
			str=br.readLine();
			if(str.equals("END"))
				break;
			else{
				for(int i=str.length()-1;i>=0;i--){
					bw.write(str.charAt(i));
					
				}bw.newLine();
			}
		}
		
		

		bw.flush();
		
	
	}

}
