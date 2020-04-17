package day30challenge;

import java.util.Stack;

public class ValidParenthesisString {
	public static void main(String[] args) {
		System.out.println(checkValidString("(*))"));
		System.out.println(checkValidString("*()(())*()(()()((()(()()*)(*(())((((((((()*)(()(*)"));
	}

	public static boolean checkValidString(String s) {
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> star = new Stack<>();

		for (int i=0;i<s.length();i++){
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else if (s.charAt(i) == '*') {
				star.push(i);

			} else {
				if (stack.isEmpty() && star.isEmpty()) {
					return false;
				} else if (!stack.isEmpty()) {
					stack.pop();
				} else {
					star.pop();
				}
			}
		}

		while (!stack.empty() && !star.isEmpty()) {
			if (stack.peek() < star.pop()) {
				stack.pop();
				

			} 
		}

		return stack.isEmpty();
	}

}
