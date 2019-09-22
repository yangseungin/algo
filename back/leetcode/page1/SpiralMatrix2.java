package page1;

public class SpiralMatrix2 {
	public static void main(String[] args) {
		System.out.println(generateMatrix(3));
		System.out.println(generateMatrix(4));
	}

	public static int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];
		int direction = 0; // 0: 우 1: 아래 2: 왼 3:위
		int index = 1;
		int rowStart = 0, rowEnd = n - 1;
		int columnStart = 0, columnEnd = n - 1;

		while (index <= n * n) {
			System.out.println(rowStart + " / " + rowEnd + " / " + columnStart + " / " + columnEnd + "방향:" + direction);
			for (int i = rowStart; i <= rowEnd; i++) {
				result[columnStart][i] = index++;
			}
			columnStart++;

			for (int i = columnStart; i <= columnEnd; i++) {
				result[i][rowEnd] = index++;
			}
			rowEnd--;

			for (int i = rowEnd; i >= rowStart; i--) {
				result[columnEnd][i] = index++;
			}
			columnEnd--;

			for (int i = columnEnd; i >= columnStart; i--) {
				result[i][rowStart] = index++;
			}
			rowStart++;

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}

		return result;
	}

}
