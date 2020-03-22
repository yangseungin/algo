package page9;

import java.util.Arrays;

public class TransposeMatrix {
	public static void main(String[] args) {
		int[][] result = transpose(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });

		System.out.println(Arrays.toString(result[0]));
		System.out.println(Arrays.toString(result[1]));
		System.out.println(Arrays.toString(result[2]));
	}

	public static int[][] transpose(int[][] A) {
		int h = A.length, w = A[0].length;
		int[][] tmp = new int[w][h];

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				tmp[j][i] = A[i][j];
			}
		}

		return tmp;
	}

}
