package back;

import java.util.Scanner;

public class Back1789 {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int n = 0;
	        long s = sc.nextLong(); // 자연수의 합
	        
	        for (int i = 1; i <= s; i++) {
	            s -= i;
	            n++;
	        }
	        
	        System.out.println(n);
	}

}
