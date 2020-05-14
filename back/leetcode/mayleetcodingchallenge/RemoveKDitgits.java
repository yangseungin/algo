package mayleetcodingchallenge;

import java.util.Stack;

public class RemoveKDitgits {
	public static void main(String[] args) {
		System.out.println(removeKdigits("1432219", 3));

	}

	public static String removeKdigits(String num, int k) {
		Stack<Character> stack = new Stack<>();
		String res = "";
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			while (k > 0 && !stack.isEmpty()
					&& Character.getNumericValue(c) < Character.getNumericValue(stack.peek())) {
				stack.pop();
				k--;
			}
			if (!stack.isEmpty() || c != '0') {
				stack.push(c);
			}
		}
		while (!stack.isEmpty()) {
			res = stack.pop() + res;
		}
		if (res.isEmpty())
			return "0";
		res = res.substring(0, res.length() - k);
		if (res.isEmpty())
			return "0";
		return res;
	}

}
