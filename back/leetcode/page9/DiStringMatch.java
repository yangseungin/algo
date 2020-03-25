package page9;

import java.util.Arrays;

public class DiStringMatch {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(diStringMatch("IDID")));
	}

	public static int[] diStringMatch(String S) {
		int len = S.length();
		int[] result = new int[len + 1];

		int start = 0, end = len;

		for (int i = 0; i < len; i++) {
			if (S.charAt(i) == 'I') {
				result[i] = start++;
			} else {
				result[i] = end--;
			}
		}
		result[len] = start;

		return result;

	}

}
