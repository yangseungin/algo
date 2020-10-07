package deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Back1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]), M = Integer.parseInt(s[1]);
        Deque<Integer> deque = new LinkedList<>();
        int res = 0;

        for (int i = 1; i <= N; i++)
            deque.add(i);

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            while (true) {
                int idx = 0;
                Iterator<Integer> it = deque.iterator();
                while (it.hasNext()) {
                    if (it.next() == num)
                        break;
                    idx++;
                }
                if (idx == 0) {
                    deque.pollFirst();
                    break;
                } else if (idx > deque.size() / 2) {
                    deque.addFirst(deque.removeLast());
                    res++;
                } else {
                    deque.addLast(deque.removeFirst());
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
