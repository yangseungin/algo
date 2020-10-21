package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2579 {
    public static void main(String[] args) throws IOException {
        //Math.max(마지막계단+ 전전계단의 최대값, 마지막계단, 마지막전계단, 전전전계단까지의 최대);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N];
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());
        dp[0] = arr[0];
        if(N>=2)
            dp[1] = Math.max(arr[0] + arr[1], arr[1]);
        if(N>=3)
            dp[2] = Math.max(arr[0] + arr[2], arr[1] + arr[2]);
        for (int i = 3; i < N; i++)
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);
        System.out.println(dp[N - 1]);
    }
}
