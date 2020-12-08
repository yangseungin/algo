package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Back1260 {
    static int n, m, v;
    static int arr[][];
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];
        visit = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        dfs(v);
        sb.append("\n");
        Arrays.fill(visit, false);
        bfs(v);
        System.out.println(sb);
    }

    public static void dfs(int i) {
        visit[i] = true;
        sb.append(i + " ");
        for (int j = 1; j < n + 1; j++) {
            if (arr[i][j] == 1 && visit[j] == false)
                dfs(j);
        }
    }

    public static void bfs(int i) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(i);
        visit[i] = true;

        while (!que.isEmpty()) {
            int tmp = que.poll();
            sb.append(tmp + " ");
            for (int k = 1; k <= n; k++) {
                if (arr[tmp][k] == 1 && visit[k] == false) {
                    que.offer(k);
                    visit[k] = true;
                }
            }
        }
    }
}
