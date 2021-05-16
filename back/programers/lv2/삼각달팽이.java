package lv2;

import java.util.Arrays;

public class 삼각달팽이 {
    //    https://programmers.co.kr/learn/courses/30/lessons/68645
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(6)));
    }

    public static int[] solution(int n) {
        int end = n * (n + 1) / 2;
        int[][] arr = new int[n][n];
        arr[0][0] = 1;
        int count = 1;
        int i = 0, j = 0;
        while (count < end) {
            while (i + 1 < n && arr[i + 1][j] == 0) {
                arr[++i][j] = ++count;
            }
            while (j + 1 < n && arr[i][j + 1] == 0) {
                arr[i][++j] = ++count;
            }
            while (i - 1 > 0 && arr[i - 1][j - 1] == 0) {
                arr[--i][--j] = ++count;
            }
        }

        int[] answer = new int[end];
        int idx = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                answer[idx++] = arr[i][j];
            }
        }
        return answer;
    }
}
