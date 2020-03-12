package page8;

import java.util.Arrays;

public class MaximizeDistanceToClosestPerson {
	public static void main(String[] args) {
		System.out.println(maxDistToClosest(new int[] { 1, 0, 0, 0}));
	}

	public static int maxDistToClosest(int[] seats) {
		int N = seats.length;
		int result = 0;
		int[] left = new int[N], right = new int[N];
		 Arrays.fill(left, N);
	     Arrays.fill(right, N);

		for (int i = 0; i < N; i++) {
			if (seats[i] == 1) {
				left[i] = 0;
			} else if (i > 0) {
				left[i] = left[i - 1] + 1;
			}
		}
		for (int i = N - 1; i >= 0; i--) {
			if (seats[i] == 1) {
				right[i] = 0;
			} else if (i < N - 1) {
				right[i] = right[i + 1] + 1;
			}
		}

		for (int i = 0; i < N; i++) {
			if (seats[i] == 0) {
				result = Math.max(result, Math.min(left[i], right[i]));
			}
		}

		return result;
	}

}
