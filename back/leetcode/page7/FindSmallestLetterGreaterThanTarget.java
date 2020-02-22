package page7;

public class FindSmallestLetterGreaterThanTarget {
	public static void main(String[] args) {
		System.out.println(nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'a'));
	}

	public static char nextGreatestLetter(char[] letters, char target) {
		boolean[] seen = new boolean[26];
		for (char c : letters)
			seen[c - 'a'] = true;

		while (true) {
			target++;
			if (target > 'z')
				target = 'a';
			if (seen[target - 'a'])
				return target;
		}
	}
}
