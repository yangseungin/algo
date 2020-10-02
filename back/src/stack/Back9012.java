package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		String str="";
		for(int i=0;i<n;i++){
			str=br.readLine();
			
			if(cal(str)){
				bw.write(String.valueOf("YES"));
				bw.newLine();
			}
			else{
				bw.write(String.valueOf("NO"));
				bw.newLine();
			}
		}
		bw.flush();
		
	}
	public static boolean cal(String str){
		int count=0;
		for(int j=0;j<str.length();j++){
			if(str.charAt(j)=='(')
				count++;
			else
				count--;	
			
			if(count<0)
				return false;
		}
		
		if(count==0)
			return true;
		else 
			return false;
		
	}

}
