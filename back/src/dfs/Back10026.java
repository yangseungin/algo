package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back10026 {
    static char[][] map;
    static int[] X = {0, 1, 0, -1};
    static int[] Y = {1, 0, -1, 0};
    static boolean[][] check;
    static int count = 0;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        check = new boolean[N][N];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++)
                map[i][j] = line.charAt(j);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!check[i][j]) {
                    dfs(j, i);
                    count++;
                }
            }
        }
        sb.append(count+" ");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if(map[i][j] =='G')
                    map[i][j]='R';
        }
        check = new boolean[N][N];
        count=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!check[i][j]){
                    dfs(j,i);
                    count++;
                }
            }
        }
        sb.append(count);
        System.out.println(sb);
    }

    private static void dfs(int x, int y) {
        check[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + X[i];
            int ny = y + Y[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !check[ny][nx] && map[ny][nx] == map[y][x]) {
                    dfs(nx, ny);
            }
        }
    }
}
