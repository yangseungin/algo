package lv2;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push('(');
            else {
                if (stack.isEmpty())
                    return false;
                elses
                    stack.pop();
            }
        }

        return stack.isEmpty() ? true : false;
    }
}
