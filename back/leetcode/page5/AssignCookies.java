package page5;

import java.util.Arrays;

public class AssignCookies {
	public static void main(String[] args) {
		System.out.println(findContentChildren(new int[] { 1, 2, 3 }, new int[] { 1, 1 }));
	}

	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);

		int indexG = g.length - 1, indexS = s.length - 1;
		int result = 0;

		while (indexG >= 0 && indexS >= 0) {
			if (s[indexS] >= g[indexG]) {
				result++;
				indexS--;
				indexG--;
			} else {
				indexG--;
			}
		}

		return result;
	}

}
