package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Back1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Double> stack = new Stack<>();
        Map<Character, Integer> map = new HashMap<>();
        String line = br.readLine();

        char tmp = 'A';
        for (int i = 0; i < N; i++) {
            map.put(tmp++, Integer.parseInt(br.readLine()));
        }

        for (char c : line.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                stack.push(Double.valueOf(map.get(c)));
            } else {
                double num1 = stack.pop();
                double num2 = stack.pop();
                double cal = 0;
                switch (c) {
                    case '+':
                        stack.push(num2 + num1);
                        break;
                    case '-':
                        stack.push(num2 - num1);
                        break;
                    case '*':
                        stack.push(num2 * num1);
                        break;
                    case '/':
                        stack.push(num2 / num1);
                        break;

                }
            }
        }
        System.out.println(String.format("%.2f", stack.pop()));
    }
}
