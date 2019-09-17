package page1;

public class UniquePaths2 {
	public static void main(String[] args) {
		System.out.println(uniquePathsWithObstacles(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }));

		System.out.println(uniquePathsWithObstacles(new int[][] { { 0, 0 },{1,1},{0,0} }));
	}

	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		

		int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

		for (int i = 0; i < obstacleGrid.length; i++) {
			if (obstacleGrid[i][0] != 1) {
				dp[i][0] = obstacleGrid[i][0] + 1;
			} else {
				dp[i][0] = 0;
				for(int j=i;j<obstacleGrid.length;j++){
					dp[j][0]=0;
				}
				break;
			}
		}
		for (int i = 0; i < obstacleGrid[0].length; i++) {
			if (obstacleGrid[0][i] != 1) {
				dp[0][i] = obstacleGrid[0][i] + 1;
			} else {
				dp[0][i] = 0;
				for(int j=i;j<obstacleGrid[0].length;j++){
					dp[0][j]=0;
				}
				break;
			}

		}
		// 확인용
		for (int i = 1; i < obstacleGrid.length; i++) {
			for (int j = 1; j < obstacleGrid[i].length; j++) {
				if(obstacleGrid[i][j]==1){
					dp[i][j]=0;
					continue;
				}
				
				if (obstacleGrid[i - 1][j] == 1) {
					dp[i][j] = dp[i][j - 1];
				} else if (obstacleGrid[i][j - 1] == 1) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}

			}
		}

		for (int i = 0; i < obstacleGrid.length; i++) {
			for (int j = 0; j < obstacleGrid[i].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}

		return dp[dp.length - 1][dp[0].length - 1];
	}
}
