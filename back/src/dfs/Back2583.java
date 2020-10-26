package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Back2583 {
    static int count = 0;
    static int[][] map;
    static boolean[][] check;
    static int M;
    static int N;

    private static int[] X = {-1, 0, 1, 0};
    private static int[] Y = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new int[M][N];
        check = new boolean[M][N];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken()), x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
            for (int j = y1; j < y2; j++)
                for (int k = x1; k < x2; k++)
                    map[j][k]++;
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0) {
                    dfs(j, i);
                    list.add(count);
                    count = 0;
                } else
                    continue;
                ;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.size() + "\n");
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++)
            sb.append(list.get(i) + " ");
        System.out.println(sb);

    }

    private static void dfs(int x, int y) {
        map[y][x] = 1;
        count++;
        for (int i = 0; i < 4; i++) {
            int nx = x + X[i], ny = y + Y[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < M && map[ny][nx] == 0)
                dfs(nx, ny);

        }
    }
}
