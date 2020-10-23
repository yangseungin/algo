package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1012 {
    private static int[] X = {-1, 0, 1, 0};
    private static int[] Y = {0, 1, 0, -1};
    private static boolean[][] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
            //가로 M,x 세로 N,y

            int[][] map = new int[N][M];
            check = new boolean[N][M];
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == 1) {
                        dfs(j, i, check, map);
                        count++;
                    } else
                        continue;
                }
            }
            sb.append(count + "\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int x, int y, boolean[][] check, int[][] map) {
        check[y][x] = true;
        map[y][x] = 0;
        for (int i = 0; i < 4; i++) {
            int nextX = x + X[i];
            int nextY = y + Y[i];
            if (nextX < 0 || nextY < 0 || nextY >= check.length || nextX >= check[0].length)  //범위 벗어남
                continue;
            if (check[nextY][nextX]) //이미 방문
                continue;
            if (map[nextY][nextX] == 0) {
                check[nextY][nextX] = true;
                continue;
            }
            dfs(nextX, nextY, check, map);
        }
    }
}
