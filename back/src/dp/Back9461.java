package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long[] dp = new long[101];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= 100; i++)
            dp[i] = dp[i - 3] + dp[i - 2];

        for (int i = 0; i < T; i++)
            System.out.println(dp[Integer.parseInt(br.readLine())]);

    }
}
