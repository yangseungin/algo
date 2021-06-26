package lv2;

public class 가장큰정사각형 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}}));

    }

    public static int solution(int[][] board) {
        int max = 0;
        if (board.length < 2 || board[0].length < 2) {
            return board[0][0] == 0 ? 0 : 1;
        }
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (board[i][j] >= 1) {
                    int left = board[i][j - 1];
                    int up = board[i - 1][j];
                    int leftUp = board[i - 1][j - 1];
                    int min = Math.min(Math.min(left, up), leftUp);
                    board[i][j] = min + 1;
                    max = Math.max(max, board[i][j]);
                }
            }
        }
        return max * max;
    }
}
