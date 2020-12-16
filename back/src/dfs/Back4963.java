package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back4963 {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] map;
    static boolean[][] visited;
    static int w, h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String input = "";
        StringBuilder sb = new StringBuilder();
        while (!(input = br.readLine()).equals("0 0")) {
            int cnt = 0;
            st = new StringTokenizer(input);
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            map = new int[h][w];
            visited = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++)
                    map[i][j] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1) {
                        dfs(i, j);
                        cnt++;
                    }

                }
            }
            sb.append(cnt + "\n");

        }
        System.out.println(sb);

    }

    private static void dfs(int y, int x) {
        visited[y][x] = true;
        map[y][x] = 0;

        for (int i = 0; i < 8; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX >= 0 && nextY >= 0 && nextX < w && nextY < h && !visited[nextY][nextX] && map[nextY][nextX] == 1)
                dfs(nextY, nextX);
        }
    }
}
