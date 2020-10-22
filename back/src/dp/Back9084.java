package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back9084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] coin = new int[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++)
                coin[i] = Integer.parseInt(st.nextToken());

            int m = Integer.parseInt(br.readLine());
            int[] dp = new int[m + 1];

            dp[0] = 1;
            for (int i = 1; i <= n; i++)
                for (int j = coin[i]; j <= m; j++)
                    dp[j] += dp[j - coin[i]];

            System.out.println(dp[m]);
        }
    }
}
