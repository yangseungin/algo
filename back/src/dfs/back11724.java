package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back11724 {
    static int[][] map = new int[1001][1001];
    static boolean[] check = new boolean[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            map[u][v] = 1;
            map[v][u] = 1;
        }
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (!check[i]) {
                dfs(N, i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static void dfs(int N, int idx) {
        if (check[idx]) {
            return;
        } else {
            check[idx] = true;
            for (int i = 1; i <= N; i++) {
                if (map[idx][i] == 1) {
                    dfs(N, i);
                }
            }
        }
    }
}
