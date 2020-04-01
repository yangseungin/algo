package page9;

public class ScoreAfterFlippingMatrix {
	public static void main(String[] args) {
		System.out.println(matrixScore(new int[][] { { 0, 0, 1, 1 }, { 1, 0, 1, 0 }, { 1, 1, 0, 0 } }));
	}

	public static int matrixScore(int[][] A) {
		int R = A.length, C = A[0].length;
		int result = 0;
		for (int c = 0; c < C; ++c) {
			int col = 0;
			for (int r = 0; r < R; ++r)
				col += A[r][c] ^ A[r][0];
			result += Math.max(col, R - col) * (1 << (C - 1 - c));
		}
		return result;
	}

}
