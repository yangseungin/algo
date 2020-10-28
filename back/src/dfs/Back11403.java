package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back11403 {
    static int[][] map;
    static int[][] ans;
    static boolean[] check;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        ans = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            check = new boolean[N];
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !check[j]) {
                    dfs(i, j);

                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void dfs(int x, int y) {
        check[y] = true;
        ans[x][y] = 1;

        for (int i = 0; i < N; i++) {
            if (map[y][i] == 1 && !check[i]) {
                dfs(x, i);
            }
        }
    }
}
