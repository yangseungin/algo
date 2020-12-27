package Test.cheonha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ezreal여눈부터가네ㅈㅈ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        //0 0 1 1 3 5 11 21 43 ...
        //2배 -1, 2배+1 반복
        dp[0] = 0;

        if (N >= 1)
            dp[1] = 0;
        if (N >= 2)
            dp[2] = 1;
        for (int i = 3; i <= N; i++) {
            if (i % 2 == 1)
                dp[i] = (dp[i - 1] * 2 - 1) % 1000000007;
            else
                dp[i] = (dp[i - 1] * 2 + 1) % 1000000007;
        }
        System.out.println(dp[N]);

    }
}
