package deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Back2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++)
            deque.add(i);

        for (int i = 0; i < N - 1; i++) {
            sb.append(deque.removeFirst() + " ");
            deque.addLast(deque.removeFirst());
        }
        sb.append(deque.getFirst());
        System.out.println(sb.toString());
    }
}
