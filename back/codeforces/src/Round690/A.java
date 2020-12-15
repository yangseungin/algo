package Round690;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> deque = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++)
                deque.add(Integer.parseInt(st.nextToken()));

            int idx = 0;
            while (!deque.isEmpty()) {
                if (idx % 2 == 0)
                    sb.append(deque.removeFirst() + " ");
                else
                    sb.append(deque.removeLast() + " ");
                idx++;
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
