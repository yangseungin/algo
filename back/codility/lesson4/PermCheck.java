package lesson4;

import java.util.Arrays;

public class PermCheck {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 4, 1, 3, 2 }));
		System.out.println(solution(new int[] { 4, 1, 3 }));
	}

	public static int solution(int[] A) {
		int result = 1;
		Arrays.sort(A);
		for (int i = 1; i <= A.length; i++) {
			if (A[i - 1] != i) {
				return 0;
			}

		}

		return result;
	}

}
