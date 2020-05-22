package page10;

import java.util.Stack;

public class RemoveOutermostParentheses {
	public static void main(String[] args) {
		System.out.println(removeOuterParentheses("(()())(())"));
	}

	public static String removeOuterParentheses(String S) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(' && !stack.isEmpty()) {
				sb.append(S.charAt(i));
				stack.push(S.charAt(i));
			} else if (S.charAt(i) == '(' && stack.isEmpty()) {
				stack.push(S.charAt(i));
			} else if (S.charAt(i) == ')') {
				stack.pop();
				if (!stack.isEmpty()) {
					sb.append(S.charAt(i));
				}
			}
		}
		return sb.toString();
	}

}
