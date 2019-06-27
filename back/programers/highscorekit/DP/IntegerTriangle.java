package highscorekit.DP;

public class IntegerTriangle {
	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } }));
	}

	public static int solution(int[][] triangle) {

		int answer = 0;
		int[][] dp = new int[triangle.length + 1][triangle.length + 1];

		for (int i = 1; i <= triangle.length; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i][j] = triangle[i - 1][j - 1];
				System.out.print(dp[i][j]);
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
			System.out.println();

		}

		return answer;

	}

}
