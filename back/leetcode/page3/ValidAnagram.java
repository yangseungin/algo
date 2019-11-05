package page3;

public class ValidAnagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram"));
	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] alapha = new int[26];
		for (int i = 0; i < s.length(); i++) {
			alapha[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < t.length(); i++) {
			alapha[t.charAt(i) - 'a']--;
		}
		for (int i : alapha) {
			if (i != 0) {
				return false;
			}
		}

		return true;
	}

}
