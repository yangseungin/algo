package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back6603 {
    static int N;
    static int[] arr;
    static boolean[] check;

    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        while (true) {
            String[] input = br.readLine().split(" ");
            N = Integer.parseInt(input[0]);

            if (N == 0) {
                break;
            }

            arr = new int[N];
            check = new boolean[N];

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(input[i + 1]);
            }
            dfs(0, 0);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int start, int depth) {
        if (depth == 6) {
            for (int i = 0; i < N; i++) {
                if (check[i]) {
                    sb.append(arr[i] + " ");
                }
            }
            sb.append("\n");
        }
        for (int i = start; i < N; i++) {
            check[i] = true;
            dfs(i + 1, depth + 1);
            check[i] = false;
        }

    }
}
