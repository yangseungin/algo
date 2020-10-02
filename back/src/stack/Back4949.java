package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        boolean flag;
        while (!(line = br.readLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();
            flag = true;

            for (char c : line.toCharArray()) {
                if (c == '(' || c == '[')
                    stack.push(c);
                else if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        flag = false;
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        flag = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty())
                flag = false;
            if (flag)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
