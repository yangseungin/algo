package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back11066 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int K = Integer.parseInt(br.readLine());
            int[] fileSizeArr = new int[K + 1];
            int[] sum = new int[K + 1];
            int[][] dp = new int[502][502];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= K; i++) {
                fileSizeArr[i] = Integer.parseInt(st.nextToken());
                sum[i] = sum[i - 1] + fileSizeArr[i];
            }

            for (int i = 2; i <= K; i++) {
                for (int j = i - 1; j > 0; j--) {
                    dp[j][i] = Integer.MAX_VALUE;
                    for (int k = j; k <= i; k++) {
                        dp[j][i] = Math.min(dp[j][i], dp[j][k] + dp[k + 1][i]);
                    }

                    dp[j][i] += sum[i] - sum[j - 1];
                }
            }

            sb.append(dp[1][K] + "\n");
        }
        System.out.println(sb);
    }
}
