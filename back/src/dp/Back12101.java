package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back12101 {
    static int[] dp;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        if(n>=2)
            dp[2] = 2;
        if(n>=3)
            dp[3] = 4;
        for (int i = 4; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        sb = new StringBuilder();
        getValue(n, k);

        System.out.println(sb.toString());
        System.out.println(Arrays.toString(dp));
    }

    public static void getValue(int n, int k) {
        if (dp[n] < k) {
            System.out.println(-1);
            return;
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (dp[n - i] >= k) {
                    if (n - i > 0) {
                        sb.append(i + "+");
                        getValue(n-i,k);
                    } else
                        sb.append(i);

                    break;
                }
                k -= dp[n - i];
            }
            return;
        }
    }
}
