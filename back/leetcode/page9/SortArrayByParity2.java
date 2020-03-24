package page9;

import java.util.Arrays;

public class SortArrayByParity2 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortArrayByParity2(new int[] { 4, 2, 5, 7 })));

	}

	public static int[] sortArrayByParity2(int[] A) {
		int[] result = new int[A.length];

		int idx = 0;
		for (int x : A) {
			if (x % 2 == 0) {
				result[idx] = x;
				idx += 2;
			}
		}
		idx = 1;

		for (int x : A) {
			if (x % 2 == 1) {
				result[idx] = x;
				idx += 2;
			}
		}
		return result;
	}

}
