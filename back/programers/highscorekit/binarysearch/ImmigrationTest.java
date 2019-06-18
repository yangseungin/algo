package highscorekit.binarysearch;

import java.util.Arrays;

public class ImmigrationTest {
	public static void main(String[] args) {
		System.out.println(solution(6, new int[] { 7, 10 }));

	}

	public static long solution(int n, int[] times) {

		Arrays.sort(times);
		int max = times[times.length - 1];

		long left = 1;
		long right = (long) max * n; // 최악의 상황

		while (left + 1 < right) {
			long mid = (left + right) / 2;
			long sum = 0;
			for (int time : times) {
				sum += (mid / time);
			}

			if (sum >= n)
				right = mid;
			else
				left = mid;
		}

		return (int) right;
	}

}
