package page1;

public class UniquePaths {
	public static void main(String[] args) {
		System.out.println(uniquePath(3, 2));
		System.out.println(uniquePath(7, 3));
	}

	public static int uniquePath(int m, int n) {
		// 이거역시 dp 같은데
		// 지금자리는 위에서온거+왼쪽에서온
		int[][] dp = new int[m][n];

		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;

		}
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}

		return dp[m - 1][n - 1];
	}

}
