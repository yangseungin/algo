package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back3968 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (stack.isEmpty())
                    stack.push(c);
                else {
                    if (c == 'A' && stack.peek() == 'A')
                        stack.pop();
                    else if (c == 'B' && stack.peek() == 'B')
                        stack.pop();
                    else
                        stack.push(c);
                }
            }
            if (stack.size() == 0)
                res++;
            else
                stack.clear();
        }
        System.out.println(res);

    }
}
