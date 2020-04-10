package day30challenge;

import java.util.Stack;

public class BackspaceStringCompare {
	public boolean backspaceCompare(String S, String T) {
        return input(S).equals(input(T));
    }

    public String input(String S) {
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
