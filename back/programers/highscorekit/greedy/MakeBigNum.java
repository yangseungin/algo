package highscorekit.greedy;

import java.util.Stack;

public class MakeBigNum {
	public static void main(String[] args) {
		System.out.println(solution("1924", 2));

	}

	public static String solution(String number, int k) {
		char[] result = new char[number.length() - k];
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < number.length(); i++) {
			char ch = number.charAt(i);
			while (!stack.isEmpty() && stack.peek() < ch && k > 0) {
				stack.pop();
				k--;
			}
			stack.push(ch);

		}
		for (int i = 0; i < result.length; i++) {
			result[i] = stack.get(i);
		}
		return new String(result);

	}

}
