package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back14500 {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int N, M, max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                DFS(i, j, 0, 0);
                Check(i, j);
            }
        }
        System.out.println(max);
    }

    private static void Check(int x, int y) {
        int val = map[x][y];
        int block = 4;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (block <= 2)
                return;
            if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                block--;
                continue;
            }
            min = Math.min(min, map[nextX][nextY]);
            val += map[nextX][nextY];
        }
        if (block == 4)
            val -= min;
        max = Math.max(max, val);
    }

    private static void DFS(int x, int y, int depth, int sum) {
        if (depth == 4) {
            max = Math.max(max, sum);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M || visited[nextX][nextY])
                continue;

            visited[nextX][nextY] = true;
            DFS(nextX, nextY, depth + 1, sum + map[nextX][nextY]);
            visited[nextX][nextY] = false;


        }

    }
}
