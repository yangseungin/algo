package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back1725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        long res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                int height = arr[stack.pop()];
                int width = i;
                if (!stack.empty()) {
                    width = i - stack.peek() - 1;
                }
                res = Math.max(res, width * height);
            }
            stack.push(i);
        }

        //남은스택에서 더 클경우
        while(!stack.isEmpty()){
            int height = arr[stack.pop()];
            int width = N;
            if(!stack.empty()){
                width = N- stack.peek()-1;
            }
            res = Math.max(res, width * height);
        }

        System.out.println(res);
    }
}
