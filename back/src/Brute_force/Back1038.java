package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Back1038 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N < 10)
            System.out.println(N);
        else
            System.out.println(solution(N));

    }

    public static String solution(int n) {
        Queue<String> que = new LinkedList<>();
        int cnt = 9;//
        for (int i = 0; i < 10; i++)
            que.add(String.valueOf(i));

        while (!que.isEmpty()) {
            String poll = que.poll();
            for (int i = 0; i < (poll.charAt(poll.length() - 1) - '0'); i++) {
                System.out.println(poll+i);
                que.add(poll + i);
                cnt++;
                if (cnt == n) {
                    return poll + i;
                }
            }
        }
        return String.valueOf(-1);
    }
}
