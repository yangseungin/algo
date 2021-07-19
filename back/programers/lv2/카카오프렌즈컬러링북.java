package lv2;

import java.util.Arrays;

public class 카카오프렌즈컬러링북 {
    static int count = 0;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(6, 4, new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}})));
    }

    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        boolean[][] check = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0 && !check[i][j]) {
                    numberOfArea++;
                    dfs(i, j, picture, check);
                }
                if (count > maxSizeOfOneArea)
                    maxSizeOfOneArea = count;
                count = 0;
            }
        }


        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        return answer;
    }

    public static void dfs(int x, int y, int[][] picture, boolean[][] check) {
        if (check[x][y])
            return;

        check[x][y] = true;
        count++;

        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX < 0 || nextX >= picture.length || nextY < 0 || nextY >= picture[0].length)
                continue;

            if (!check[nextX][nextY] && picture[x][y] == picture[nextX][nextY]) {
                dfs(nextX, nextY, picture, check);
            }
        }
    }
}

