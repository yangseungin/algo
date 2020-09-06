package September;

public class ImageOverlap {

	public static void main(String[] args) {
		System.out.println(largestOverlap(new int[][] { { 1, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } },
				new int[][] { { 0, 0, 0 }, { 0, 1, 1 }, { 0, 0, 1 } }));
	}

	public static int largestOverlap(int[][] A, int[][] B) {
		int max = 0;
		int len = A.length;
		int[][] expandArr = new int[3 * len - 2][3 * len - 2];

		// 가운데 넣고 확장시
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				expandArr[i + len - 1][j + len - 1] = B[i][j];
			}
		}
		for (int i = 0; i < 2 * len - 1; i++) {
			for (int j = 0; j < 2 * len - 1; j++) {
				max = Math.max(max, compareArr(A, expandArr, i, j));
			}
		}

		return max;
	}

	public static int compareArr(int[][] A, int[][] expandArr, int x, int y) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				count += A[i][j] * expandArr[i + y][j + x];
			}
		}

		return count;
	}

}
