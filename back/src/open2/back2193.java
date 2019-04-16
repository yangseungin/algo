package open2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class back2193 {
	public static void main(String[] args) throws IOException {
		/*
		 * 1	1
		 * 2	10 
		 * 3	100 101
		 * 4	1000 1001 1010
		 * 5	10000 10001 10010 10100 10101
		 * 6	100000 100001 100010 100100 100101 101000 101001 101010
		 * 7	1000000 1000001 1000010 1000100 1000101 1001000 1001001 1001010 1010000 1010001 1010010 1010100 1010101
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][];
		
		arr[0][0]=0;
		arr[1][0]=1;
		for(int i=2;i<n;i++){
			
			
			
			
		}
		
		
		
		
		
		
		bw.write(String.valueOf(n));
		bw.flush();
		
	}

}
