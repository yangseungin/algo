package priority_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Back11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int p1 = Math.abs(o1);
            int p2 = Math.abs(o2);
            if (p1 == p2) {
                return o1 > o2 ? 1 : -1;
            }
            return p1 - p2;
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (queue.isEmpty())
                    sb.append(0 + "\n");
                else
                    sb.append(queue.poll() + "\n");
            } else
                queue.add(num);
        }
        System.out.println(sb.toString());
    }
}
