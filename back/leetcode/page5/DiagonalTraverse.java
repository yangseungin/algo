package page5;

import java.util.Arrays;

public class DiagonalTraverse {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(findDiagonalOrder(new int[][] { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } })));
	}

	public static int[] findDiagonalOrder(int[][] matrix) {
		if(matrix.length==0){
			return new int[0];
		}
		int row = 0, col = 0;
		int m = matrix.length;
		int n = matrix[0].length;
		int[] result = new int[m * n];

		for (int i = 0; i < result.length; i++) {
			result[i] = matrix[row][col];

			if ((row + col) % 2 == 0) { // 대각선 라
				if (col == n - 1) {
					row++;
				} else if (row == 0) {
					col++;
				} else {
					row--;
					col++;
				}
			} else {
				if (row == m - 1) {
					col++;
				} else if (col == 0) {
					row++;
				} else {
					row++;
					col--;
				}
			}
		}
		return result;
	}
}
