package page9;

public class MinimumAddtoMakeParenthesesValid {
	public static void main(String[] args) {
		System.out.println(minAddToMakeValid("()))(("));
	}

	public static int minAddToMakeValid(String S) {
		int result = 0, val = 0;
		for (int i = 0; i < S.length(); i++) {
			val += S.charAt(i) == '(' ? 1 : -1;
			if (val == -1) {
				result++;
				val++;
			}
		}

		return result + val;
	}

}
