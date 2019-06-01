package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i=0;i<t;i++){
        	String input = br.readLine();
        	if(solution(input))
        		result++;
        }
        bw.write(String.valueOf(result));
        bw.flush();


	}
	
	public static boolean solution(String input){
		boolean[] alpabet = new boolean[26];
        int length = input.length();
        
        int i;
        System.out.println(alpabet[0]);
        for(i=0; i<length; i++) {
            char temp = input.charAt(i);
            if(alpabet[temp-'a']) {
                return false;
            }else {
                if(i< length-1 && temp != input.charAt(i+1)) {
                    alpabet[temp-'a'] = true;
                }
                
            }
        }


		
			
		
		return true;
	}

}
