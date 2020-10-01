package list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Back1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 1; i <= N; i++)
            deque.add(i);

        while (!deque.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                deque.addLast(deque.removeFirst());
            }
            sb.append(deque.removeFirst() + ", ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(">");
        System.out.println(sb.toString());
    }
}
