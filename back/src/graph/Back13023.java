package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Back13023 {
    static List<Integer>[] list;
    static int res = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        list = new ArrayList[N];
        for (int i = 0; i < N; i++)
            list[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            list[num1].add(num2);
            list[num2].add(num1);
        }
        for (int i = 0; i < N; i++) {
            if (res == 1) break;
            dfs(new boolean[N], i, 0);
        }
        System.out.println(res);
    }

    private static void dfs(boolean[] visited, int num, int idx) {
        if (res == 1)
            return;
        if (idx >= 5) {
            res = 1;
            return;
        }

        for (int i = 0; i < list[num].size(); i++) {
            int tmp = list[num].get(i);
            if (!visited[tmp]) {
                visited[tmp] = true;
                dfs(visited, tmp, idx + 1);
                visited[tmp] = false;
            }
        }
    }
}
