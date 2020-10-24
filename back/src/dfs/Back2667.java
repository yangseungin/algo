package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Back2667 {
    private static int[] X = {-1, 0, 1, 0};
    private static int[] Y = {0, 1, 0, -1};
    static int[][] map;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++)
                map[i][j] = line.charAt(j) - '0';

        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    dfs(j, i, map);
                    list.add(cnt);
                    cnt = 0;
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++)
            sb.append(list.get(i) + "\n");
        System.out.println(sb);


    }

    private static void dfs(int x, int y, int[][] map) {
        map[y][x] = 0;
        cnt++;
        for (int i = 0; i < 4; i++) {
            int nextX = x + X[i];
            int nextY = y + Y[i];
            if (nextX >= 0 && nextY >= 0 && nextX < map[0].length && nextY < map.length && map[nextY][nextX] == 1) {
                dfs(nextX, nextY, map);
            }
        }
    }
}
