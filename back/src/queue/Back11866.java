package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Back11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]), K = Integer.parseInt(s[1]);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++)
            queue.offer(i);

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                int n = queue.poll();
                queue.offer(n);
            }

            sb.append(queue.poll() + ", ");
        }
        String substring = sb.toString().substring(0, sb.length() - 2);
        System.out.println(substring+">");
    }
}
