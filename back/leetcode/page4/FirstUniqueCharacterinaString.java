package page4;

import java.util.HashMap;

public class FirstUniqueCharacterinaString {
	public static void main(String[] args) {
		System.out.println(firstUniqueChar("leetcode"));
	}

	public static int firstUniqueChar(String s) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		int n = s.length();

		for (char c : s.toCharArray()) {
			hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (hashMap.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
	}
}
