package Test.gunwookim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알약 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] dp = new long[31];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= 30; i++) {
            long cnt = 0;
            for (int j = 0; j < i; j++)
                cnt += dp[j] * dp[i - j - 1];
            dp[i] = cnt;
        }
        int N = 0;
        StringBuilder sb = new StringBuilder();
        while ((N = Integer.parseInt(br.readLine())) != 0) {
            sb.append(dp[N] + "\n");
        }
        System.out.println(sb);

    }
}
