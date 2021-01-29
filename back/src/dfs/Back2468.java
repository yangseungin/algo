package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Back2468 {
    public static int N;
    public static int[][] arr;
    public static int[] dy = {1, 0, -1, 0};
    public static int[] dx = {0, 1, 0, -11};

    public static int min = Integer.MAX_VALUE;
    public static int max = Integer.MIN_VALUE;
    public static int cnt = 0;
    public static PriorityQueue<Integer> pq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        pq = new PriorityQueue<>();
        pq.offer(0);

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (!pq.contains(arr[i][j])) pq.offer(arr[i][j]);
                min = (min > arr[i][j]) ? arr[i][j] : min;
                max = (max < arr[i][j]) ? arr[i][j] : max;
            }
        }

        while (!pq.isEmpty()) {
            int h = pq.poll();
            boolean[][] visited = new boolean[N][N];
            int tCnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && arr[i][j] > h) {
                        dfs(h, i, j, visited);
                        tCnt += 1;
                    }
                }
            }
            cnt = Math.max(cnt, tCnt);
        }
        System.out.println(cnt);
    }

    public static void dfs(int h, int y, int x, boolean[][] visited) {
        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nextY = dy[i] + y;
            int nextX = dx[i] + x;
            if (nextY < 0 || nextX < 0 || nextY >= N || nextX >= N) continue;
            if (arr[nextY][nextX] <= h) continue;
            if (visited[nextY][nextX]) continue;
            dfs(h, nextY, nextX, visited);
        }
    }
}
