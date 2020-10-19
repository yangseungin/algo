package dp;

import java.util.Scanner;

public class Back1003 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		int[][] fibo = new int[41][2];
		fibo[0][0]=1;
		fibo[1][1]=1;
		
		for(int i = 2; i < 41; i++){
			for(int j = 0; j < 2; j++){
				fibo[i][j] = fibo[i-1][j] + fibo[i-2][j];
			}
		}
		
		for(int i=0;i<num;i++){
			int result=sc.nextInt();
			System.out.println(fibo[result][0]+" "+fibo[result][1]);
		}
		

	
		
	}
	
}
