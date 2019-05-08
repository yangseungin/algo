package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] croa={"c=","c-","dz=","d-","lj","nj","s=","z="};
		String input = br.readLine();
		
		for(int i=0;i<croa.length;i++){
			input=input.replace(croa[i],"a");
		}


		

		bw.write(String.valueOf(input.length()));
		bw.flush();

	}

}
