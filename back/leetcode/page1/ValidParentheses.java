package page1;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("([)]"));
		System.out.println(isValid("{[]}"));
		System.out.println(isValid("]"));
		System.out.println(isValid("(])"));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
	
		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				if(stack.isEmpty())
					return false;
				if (ch == ')' && stack.peek() == '(') {
					stack.pop();
				} else if (ch == '}' && stack.peek() == '{') {
					stack.pop();
				} else if (ch == ']' && stack.peek() == '[') {
					stack.pop();
				}else{
					break;
				}
			}
		}
		if (stack.size() == 0)
			return true;

		return false;
	}

}
