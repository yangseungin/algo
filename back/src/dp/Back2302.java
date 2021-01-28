package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2302 {
    public static void main(String[] args) throws IOException {
        int[] dp = new int[41];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= T; i++)
            dp[i] = dp[i - 1] + dp[i - 2];

        int n = Integer.parseInt(br.readLine());
        int ans = 1;
        int now = 0;
        for (int i = 0; i < n; i++) {
            int seat = Integer.parseInt(br.readLine());
            ans *= dp[seat - now - 1];
            now = seat;
        }
        ans *= dp[T - now];
        System.out.println(ans);
    }
}
