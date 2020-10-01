package list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb;
        for (int i = 0; i < cnt; i++) {
            sb = new StringBuilder();
            Stack<Character> st1 = new Stack<>();
            Stack<Character> st2 = new Stack<>();
            String str = br.readLine();
            for (char c : str.toCharArray()) {
                if (c == '<') {
                    if (!st1.isEmpty())
                        st2.push(st1.pop());
                } else if (c == '>') {
                    if (!st2.isEmpty())
                        st1.push(st2.pop());
                } else if (c == '-') {
                    if (!st1.isEmpty())
                        st1.pop();
                } else {
                    st1.push(c);
                }
            }

            while (!st2.isEmpty())
                st1.push(st2.pop());

            while (!st1.isEmpty())
                sb.append(st1.pop());

            System.out.println(sb.reverse().toString());

        }

    }
}
