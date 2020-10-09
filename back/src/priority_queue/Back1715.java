package priority_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Back1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
                queue.add(num);
        }
        int res=0;
        for(int i=0;i<N-1;i++){
            int num1=queue.poll();
            int num2=queue.poll();
            int tmp=num1+num2;
            res+=tmp;
            queue.add(tmp);


        }
        System.out.println(res);
    }
}
