package page8;

import java.util.HashSet;
import java.util.Set;

public class GoatLatin {
	public static void main(String[] args) {
		System.out.println(toGoatLatin("I speak Goat Latin"));
	}

	public static String toGoatLatin(String S) {
		Set<Character> set = new HashSet<>();
		for (char c : new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' })
			set.add(c);

		int t = 1;
		StringBuilder result = new StringBuilder();
		for (String word : S.split(" ")) {
			char first = word.charAt(0);
			if (set.contains(first)) {
				result.append(word);
			} else {
				result.append(word.substring(1));
				result.append(word.substring(0, 1));
			}
			result.append("ma");
			for (int i = 0; i < t; i++)
				result.append("a");
			t++;
			result.append(" ");
		}

		result.deleteCharAt(result.length() - 1);
		return result.toString();
	}

}
