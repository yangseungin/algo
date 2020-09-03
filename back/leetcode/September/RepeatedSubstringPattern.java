package September;

public class RepeatedSubstringPattern {
	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abab"));
	}
	public static boolean repeatedSubstringPattern(String s) {
        for (int len = 1; len <= s.length() / 2; len++) {
			if (s.length() % len != 0) {
				continue;
			}

			boolean result = true;

			String base = s.substring(0, len);
			for (int k = len; k < s.length(); k += len) {
				if (!base.equals(s.substring(k, k + len))) {
					result = false;
					break;
				}
			}

			if (result) {
				return true;
			}
		}

		return false;
    }

}
