package page8;

import java.util.Stack;

public class BackspaceStringCompare {
	public static void main(String[] args) {
		System.out.println(backspaceCompare("ab#c", "ad#c"));
	}
	public static boolean backspaceCompare(String S, String T) {
        return input(S).equals(input(T));
    }

    public static String input(String S) {
        Stack<Character> result = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
            	result.push(c);
            else if (!result.empty())
            	result.pop();
        }
        return String.valueOf(result);
    }

}
