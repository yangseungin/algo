package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back15990 {
    //    https://www.acmicpc.net/problem/15990
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        long[][] dp = new long[100001][4];
        long answer = 0;

        dp[1][1] = dp[2][2] = dp[3][3] = 1;
        for (int i = 1; i < dp.length; i++) {
            if (i > 1) dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % 1_000_000_009;
            if (i > 2) dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % 1_000_000_009;
            if (i > 3) dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % 1_000_000_009;

        }

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            answer = (dp[num][1] + dp[num][2] + dp[num][3]) % 1_000_000_009;
            sb.append(answer + "\n");
        }
        System.out.println(sb);

    }
}
