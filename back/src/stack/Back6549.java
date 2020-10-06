package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Back6549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while (!(line = br.readLine()).equals("0")) {
            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            long[] arr = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st.nextToken());


            long res = 0;
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                    long height = arr[stack.pop()];
                    int width = i;
                    if (!stack.empty()) {
                        width = i - stack.peek() - 1;
                    }
                    res = Math.max(res, width * height);
                }
                stack.push(i);
            }

            //남은스택에서 더 클경우
            while (!stack.isEmpty()) {
                long height = arr[stack.pop()];
                int width = n;
                if (!stack.empty()) {
                    width = n - stack.peek() - 1;
                }
                res = Math.max(res, width * height);
            }
            System.out.println(res);
        }
    }
}
