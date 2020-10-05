package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Back3078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        Queue<Integer>[] queues = new Queue[21];
        long res = 0;

        for (int i = 0; i < 21; i++) {
            queues[i] = new LinkedList<>();
        }

        for (int i = 0; i < N; i++) {
            int len = br.readLine().length();
            if( queues[len].size()>0){
                while (i - queues[len].peek() > K) {
                    queues[len].poll();
                    if (queues[len].isEmpty()) {
                        break;
                    }
                }
                res += queues[len].size();
            }
            queues[len].offer(i);
        }
        System.out.println(res);
    }
}
