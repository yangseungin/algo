package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        int res=0;
        for(int i=0;i<K;i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                stack.pop();
                continue;
            }
            stack.push(num);
        }
        for(int num:stack){
            res+=num;
        }
        System.out.println(res);
    }
}
