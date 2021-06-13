package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back17413 {
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        String input = br.readLine();
        boolean tagFlag = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '<') {
                print(st);
                tagFlag = true;
                sb.append(input.charAt(i));
            } else if (input.charAt(i) == '>') {
                tagFlag = false;
                sb.append(input.charAt(i));
            } else if (tagFlag) {
                sb.append(input.charAt(i));
            } else {
                if (input.charAt(i) == ' ') {
                    print(st);
                    sb.append(input.charAt(i));
                } else {
                    st.push(input.charAt(i));
                }
            }
        }
        print(st);
        System.out.println(sb);
    }

    static void print(Stack st) {
        while (!st.empty()) {
            sb.append(st.peek());
            st.pop();
        }
    }
}
