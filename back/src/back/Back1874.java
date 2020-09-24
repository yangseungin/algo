package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] nums = new int[count];
        Stack<Integer> stack = new Stack<>();
        int start = 1;
        boolean isTrue = true;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            if (isTrue) {
                if (start <= nums[i]) {
                    while (start <= nums[i]) {
                        stack.push(start++);
                        sb.append("+ \n");
                    }
                }
                if (stack.isEmpty()) {
                    isTrue = false;
                } else {
                    while (stack.peek()>=nums[i] ){
                        stack.pop();
                        sb.append("- \n");
                        if(stack.isEmpty())
                            break;
                    }
                }
            }
        }
        if(isTrue)
            System.out.println(sb.toString());
        else
            System.out.println("NO");

    }
}
