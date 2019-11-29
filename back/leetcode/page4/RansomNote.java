package page4;

public class RansomNote {
	public static void main(String[] args) {
		System.out.println(canConstruct("a", "b"));
		System.out.println(canConstruct("aa", "ab"));
		System.out.println(canConstruct("aa", "aab"));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] count = new int[26];
		for (char c : magazine.toCharArray()) {
			count[c - 'a']++;
		}

		for (char c : ransomNote.toCharArray()) {
			count[c - 'a']--;
			if (count[c - 'a'] < 0) {
				return false;
			}
		}

		return true;
	}

}
