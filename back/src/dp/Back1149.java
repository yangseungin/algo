package dp;

import java.io.*;
import java.util.StringTokenizer;

public class Back1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 1][3];
        int[][] answer = new int[n + 1][3];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        answer[0][0] = arr[0][0];
        answer[0][1] = arr[0][1];
        answer[0][2] = arr[0][2];
        for (int i = 1; i < n; i++) {
            answer[i][0] = Math.min(answer[i - 1][1], answer[i - 1][2]) + arr[i][0];
            answer[i][1] = Math.min(answer[i - 1][0], answer[i - 1][2]) + arr[i][1];
            answer[i][2] = Math.min(answer[i - 1][0], answer[i - 1][1]) + arr[i][2];
        }

        int min = answer[n - 1][0];
        for (int i = 1; i < 3; i++) {
            if (min > answer[n - 1][i])
                min = answer[n - 1][i];
        }
        System.out.println(String.valueOf(min));
    }
}
