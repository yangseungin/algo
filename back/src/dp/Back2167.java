package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int[][] dp = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++)
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + Integer.parseInt(st.nextToken());
        }
        int K = Integer.parseInt(br.readLine());
        for (int idx = 0; idx < K; idx++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()), j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
            System.out.println(dp[x][y] + dp[i - 1][j - 1] - dp[i - 1][y] - dp[x][j - 1]);
        }
    }
}
