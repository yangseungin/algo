package lv2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] count;

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}}));
//        System.out.println(solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}}));
    }

    public static int solution(int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];
        count = new int[maps.length][maps[0].length];
        bfs(0, 0, maps);

        return count[maps.length - 1][maps[0].length - 1] == 0 ? -1 : count[maps.length - 1][maps[0].length - 1];
    }

    private static void bfs(int x, int y, int[][] maps) {
        Queue<Grid> que = new LinkedList<>();
        que.offer(new Grid(x, y));
        visited[y][x] = true;
        count[y][x] = 1;
        while (!que.isEmpty()) {
            Grid tmp = que.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = tmp.x + dx[i];
                int nextY = tmp.y + dy[i];
                if (nextX >= 0 && nextY >= 0 && nextX < maps[0].length && nextY < maps.length && !visited[nextY][nextX] && maps[nextY][nextX] == 1) {
                    visited[nextY][nextX] = true;
                    count[nextY][nextX] = count[tmp.y][tmp.x] + 1;
                    que.offer(new Grid(nextX, nextY));
                }
            }
        }
    }

    static class Grid {
        int x, y;

        public Grid(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
