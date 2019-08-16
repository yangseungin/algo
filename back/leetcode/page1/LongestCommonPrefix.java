package page1;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}

		Arrays.sort(strs);
		String firstStr = strs[0];
		String lastStr = strs[strs.length - 1];

		int end = Math.min(firstStr.length(), lastStr.length());

		int i = 0;
		while (i < end && firstStr.charAt(i) == lastStr.charAt(i)) {
			i++;
		}

		return firstStr.substring(0, i);
	}

}
