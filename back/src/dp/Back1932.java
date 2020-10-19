package dp;

import java.util.Scanner;

public class Back1932 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int[][] dp = new int[height+1][height+1];
		int answer=0;

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i][j]= sc.nextInt();
				
				if (j == 1) {
					dp[i][j] = dp[i - 1][j] + dp[i][j];
				} else if (i == j) {
					dp[i][j] = dp[i - 1][j - 1] + dp[i][j];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + dp[i][j];
				}
				if (dp[i][j] > answer) {
					answer = dp[i][j];
				}		

			}
		}		
		System.out.println(answer);
	}
}
