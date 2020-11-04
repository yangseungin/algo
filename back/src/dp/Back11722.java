package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back11722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N + 1];
        int[] dp = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j] && dp[i] <= dp[j])
                    dp[i] = dp[j] + 1;
                else if (arr[i] == arr[j])
                    dp[i] = dp[j];
            }
        }
        int max = 0;
        for (int i = 1; i <= N; i++)
            max = Math.max(dp[i], max);
        System.out.println(max);
    }
}
