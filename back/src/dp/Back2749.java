package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2749 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int pisano = 1500000;
        long[] dp = new long[pisano + 1];
        dp[0] = 0;
        dp[1] = 1;
        n %= pisano;

        for (int i = 2; i < pisano; i++)
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000;

        System.out.println(dp[(int) n]);

    }
}