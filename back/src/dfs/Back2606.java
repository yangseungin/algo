package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2606 {
    static int N, connect, cnt;
    static int map[][];
    static int visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        connect = Integer.parseInt(br.readLine());

        map = new int[N + 1][N + 1];
        visited = new int[N + 1];
        StringTokenizer st;
        for (int i = 0; i < connect; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = map[b][a] = 1;
        }

        dfs(1);
        System.out.println(cnt);
    }

    public static void dfs(int start) {
        visited[start] = 1;
        for (int i = 1; i < N + 1; i++) {
            if (map[start][i] == 1 && visited[i] == 0) {
                dfs(i);
                cnt++;
            }
        }
    }
}
