package page7;

import java.util.Stack;

public class BaseballGame {
	public static void main(String[] args) {
		System.out.println(calPoints(new String[] { "5", "2", "C", "D", "+" }));
	}

	public static int calPoints(String[] ops) {
		int result = 0;
		Stack<Integer> stack = new Stack();
		for (String op : ops) {
			if (op.equals("+")) {
				int top = stack.pop();
				int newtop = top + stack.peek();
				stack.push(top);
				stack.push(newtop);
			} else if (op.equals("C")) {
				stack.pop();
			} else if (op.equals("D")) {
				stack.push(2 * stack.peek());
			} else {
				stack.push(Integer.valueOf(op));
			}
		}

		for (int score : stack)
			result += score;
		return result;
	}

}
