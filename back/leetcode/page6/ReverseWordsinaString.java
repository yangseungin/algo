package page6;

import java.util.Arrays;

public class ReverseWordsinaString {
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

	public static String reverseWords(String s) {
		String[] strs = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String str : strs) {
			StringBuffer buf = new StringBuffer(str);
			sb.append(buf.reverse().toString() + " ");
		}

		return sb.toString().trim();
	}
}
