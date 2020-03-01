package page8;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

	public int uniqueMorseRepresentations(String[] words) {
		String[] MORSE = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--","--.." };

		Set<String> set = new HashSet();
		for (String word : words) {
			StringBuilder code = new StringBuilder();
			for (char c : word.toCharArray())
				code.append(MORSE[c - 'a']);
			set.add(code.toString());
		}

		return set.size();
	}

}
