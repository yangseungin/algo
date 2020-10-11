package priority_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Back2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            while (st.hasMoreTokens()) {
                queue.offer(Integer.parseInt(st.nextToken()));
            }
        }
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (queue.peek() < num) {
                    queue.poll();
                    queue.offer(num);
                }
            }
        }
        System.out.println(queue.poll());

    }
}
