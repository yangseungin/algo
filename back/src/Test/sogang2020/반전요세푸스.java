package Test.sogang2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 반전요세푸스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt=0;
        Deque<Integer> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++)
            deque.add(i);

        boolean flag = false;
        while (!deque.isEmpty()) {
            if(cnt%M==0){
                if(flag)
                    flag=false;
                else
                    flag=true;
            }
            if(flag) {
                for (int i = 0; i < K - 1; i++) {
                    deque.addLast(deque.removeFirst());
                }
                sb.append(deque.removeFirst() + "\n");
            }else {
                for (int i = 0; i < K - 1; i++) {
                    deque.addFirst(deque.removeLast());
                }
                sb.append(deque.removeLast() + "\n");

            }
            cnt++;
        }
        System.out.println(sb.toString());
    }
}
