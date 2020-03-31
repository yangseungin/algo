package page9;

import java.util.Stack;

public class ValidateStackSequences {
	public static void main(String[] args) {
		System.out.println(validateStackSequences(new int[] { 1, 2, 3, 4, 5 }, new int[] { 4, 5, 3, 2, 1 }));
	}

	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		int len = pushed.length;
		Stack<Integer> stack = new Stack<>();

		int count = 0;
		for (int num : pushed) {
			stack.push(num);
			while (!stack.isEmpty() && count < len && stack.peek() == popped[count]) {
				stack.pop();
				count++;
			}
		}

		return count == len;
	}

}
