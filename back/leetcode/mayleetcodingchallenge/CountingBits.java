package mayleetcodingchallenge;

import java.util.Arrays;

public class CountingBits {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(2)));
	}

	public static int[] countBits(int num) {
		int[] dp = new int[num + 1];
		dp[0] = 0;		
		
		for (int i = 1; i <= num; i++) {
			dp[i] = dp[i >> 1] + i % 2;
		}
		return dp;
	}

}
