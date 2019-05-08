package lv4;

public class EditTerrain {

	static int size;

	public static void main(String[] args) {
		// 지형 편집
		// https://programmers.co.kr/learn/courses/30/lessons/12984

		int[][] land = { { 4, 4, 3 }, { 3, 2, 2 }, { 2, 1, 0 } };
		int P = 5;
		int Q = 3;

		System.out.println(solution(land, P, Q));

	}

	public static long height(int[][] land, int middle, int P, int Q) {
		long value = 0;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				long mul = land[i][j] - middle > 0 ? Q : -P;
				value += (land[i][j] - middle) * mul;

			}
		}

		return value;
	}

	public static long solution(int[][] land, int P, int Q) {
		size = land.length;
		long answer = -1;

		int start = 0;
		int end = 300;
		int middle = 0;

		// 최저점을 찾아야하는데
		while (start <= end) {
			middle = (start + end) / 2;
			long[] arr = { height(land, middle, P, Q), height(land, middle + 1, P, Q) };

			if (arr[0] < arr[1]) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}

		}
		for (int i = middle - 1; i <= middle + 1; i++) {
			long temp = height(land, i, P, Q);
			answer = answer > temp ? temp : answer;
		}

		return answer;
	}
}
