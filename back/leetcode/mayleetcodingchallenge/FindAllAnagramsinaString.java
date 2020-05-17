package mayleetcodingchallenge;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsinaString {
	public static void main(String[] args) {
		System.out.println(findAnagrams("cbaebabacd", "abc"));
	}

	public static List<Integer> findAnagrams(String s, String p) {
		int len = p.length() - 1;
		int[] lookup = new int[26];
		int[] dp = new int[26];
		List<Integer> result = new ArrayList<>();
		for (char c : p.toCharArray()) {
			lookup[c - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			dp[s.charAt(i) - 'a']++;
			if (i >= len) {
				if (checkAnagram(lookup, dp)) {
					result.add(i - len);
				}
				dp[s.charAt(i - len) - 'a']--;
			}
		}
		return result;
	}

	public static boolean checkAnagram(int[] lookup, int[] dp) {
		for (int i = 0; i < 26; i++) {
			if (lookup[i] != dp[i]) {
				return false;
			}
		}
		return true;
	}
}
