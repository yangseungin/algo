package open2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class back2133 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//아마 짝수여야지만 채울수 있는것으로 판단됨
		//2일떄 3개
		//4일떄 11개
		//6일때  41개 (3*2)*(3*4)+(3*2)(3*4)문양+3*6고유문양 2
		// (n-2)*(n-4)+(n-2)*(n-4고유)*2
		//
		
		//n-2 x3
		//n-4 x2
		//n-6 x2
		
		//(n-?)이값이 0이되지않는때까지 x2
		//를 돌면됨
		
		
		
		
		
	}

}
