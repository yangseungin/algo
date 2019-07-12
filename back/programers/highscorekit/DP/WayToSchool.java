package highscorekit.DP;

public class WayToSchool {
	public static void main(String[] args) {
		System.out.println(solution(4, 3, new int[][] { { 2, 2 } }));

	}

	public static int solution(int m, int n, int[][] puddles) {
		int answer = 0;
		int[][] dp = new int[n + 1][m + 1];

		dp[1][1] = 1;

		for (int[] puddle : puddles) {
			dp[puddle[1]][puddle[0]] = -1;
		}
		//print(dp);
		

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[i].length; j++) {
				// 웅덩이는 0으로
				if (dp[i][j] == -1) {
					dp[i][j] = 0;
					//print(dp);
				} else {
					if (i == 1) {
						dp[i][j] += dp[i][j - 1];
					} else {
						dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
					}
					//print(dp);
				}

				
				if (j == dp[i].length - 1) {
					answer = dp[i][j];
				}
			}
		}
		return answer;
	}
	public static void print(int[][] dp){
		for(int i=0;i<dp.length;i++){
			for(int j=0;j<dp[i].length;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("======================");
	}

}
