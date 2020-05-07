package page9;

import java.util.Arrays;

public class SumofEvenNumbersAfterQueries {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sumEvenAfterQueries(new int[] { 1, 2, 3, 4 },
				new int[][] { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } })));

	}

	public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int sum = 0;
		int[] result = new int[queries.length];

		for (int i : A) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		for (int i = 0; i < queries.length; i++) {
			if (A[queries[i][1]] % 2 == 0) {
				sum -= A[queries[i][1]];
			}
			A[queries[i][1]] += queries[i][0];
			if (A[queries[i][1]] % 2 == 0) {
				sum += A[queries[i][1]];
			}
			result[i] = sum;

		}
		return result;
	}
}
