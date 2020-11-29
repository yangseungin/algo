package Test.sogang2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 피보나치와수열과쿼리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int Q = Integer.parseInt(br.readLine());
        long[] dp = new long[N + 1];
        StringTokenizer st;
        long[] tmp = new long[N + 1];
        tmp[0] = 0;
        if (N >= 1)
            tmp[1] = 1;
        for (int j = 2; j <= N; j++)
            tmp[j] = (tmp[j - 1] + tmp[j - 2]) % 1000000007;


        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());

            for (int j = l; j <= r; j++)
                dp[j] += tmp[j - l + 1] % 1000000007;


        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(dp[i] + " ");
        }
        System.out.println(sb);

    }
}
