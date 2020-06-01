package page10;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
	public static void main(String[] args) {
		System.out.println(removeDuplicates("abbaca"));
	}

	public static String removeDuplicates(String S) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < S.length(); i++) {
			if (!stack.isEmpty() && stack.peek() == S.charAt(i)) {
				stack.pop();
			} else {
				stack.push(S.charAt(i));
			}
		}

		StringBuilder result = new StringBuilder();
		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}

		return result.reverse().toString();
	}

}
