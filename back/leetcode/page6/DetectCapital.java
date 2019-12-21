package page6;

public class DetectCapital {
	public static void main(String[] args) {
		System.out.println(detectCapitalUse("USA"));
	}

	public static boolean detectCapitalUse(String word) {
		String str = word.toLowerCase();
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			if (str.charAt(i) != word.charAt(i)) {
				++count;
			}
		}
		return (count == 0 || count == word.length() || (count == 1 && Character.isUpperCase(word.charAt(0))));
	}

}
