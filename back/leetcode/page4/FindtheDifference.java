package page4;

import java.util.HashMap;

public class FindtheDifference {
	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "abcde"));

	}

	public static char findTheDifference(String s, String t) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (hashMap.containsKey(s.charAt(i))) {
				hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
			} else {
				hashMap.put(s.charAt(i), 1);
			}
		}

		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if (hashMap.containsKey(c) && hashMap.get(c) > 0) {
				hashMap.put(c, hashMap.get(c) - 1);
			} else {
				return c;
			}
		}
		return 'x';
	}

}
