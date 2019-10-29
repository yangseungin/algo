package page3;

import java.util.HashMap;

public class IsomorphicStrings {
	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add"));
	}

	public static boolean isIsomorphic(String s, String t) {
		int sIdx = 0;
		int tIdx = 0;
		HashMap<Character, Integer> hashMap = new HashMap<>();
		HashMap<Character, Integer> hashMap2 = new HashMap<>();
		for (char c : s.toCharArray()) {
			if (!hashMap.containsKey(c)) {
				hashMap.put(c, sIdx);
				sIdx++;
			}
		}

		for (char c : t.toCharArray()) {
			if (!hashMap2.containsKey(c)) {
				hashMap2.put(c, tIdx);
				tIdx++;
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (hashMap.get(s.charAt(i)) != hashMap2.get(t.charAt(i))) {
				return false;
			}
		}

		return true;
	}

}
