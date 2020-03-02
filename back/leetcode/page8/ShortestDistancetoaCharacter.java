package page8;

import java.util.Arrays;

public class ShortestDistancetoaCharacter {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
	}

	public static int[] shortestToChar(String S, char C) {
		int[] result = new int[S.length()];
		int index = S.indexOf(C);
		int nextIndex = S.indexOf(C, index + 1);

		for (int i = 0; i < S.length(); i++) {
			if (nextIndex != -1 && (nextIndex - i) < Math.abs(index - i)) {
				index = nextIndex;
				nextIndex = S.indexOf(C, index + 1);
			}

			result[i] = Math.abs(index - i);

		}

		return result;
	}

}
