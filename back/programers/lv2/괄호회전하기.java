package lv2;

import java.util.Stack;

public class 괄호회전하기 {
    //    https://programmers.co.kr/learn/courses/30/lessons/76502
    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
    }

    public static int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        flag = false;
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        flag = false;
                        break;
                    }
                } else if (c == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        flag = false;
                        break;
                    }
                }

            }
            if (!stack.isEmpty())
                flag = false;

            if (flag) {
                answer++;
            }
            s = s.substring(1) + s.charAt(0);
        }

        return answer;
    }

}
