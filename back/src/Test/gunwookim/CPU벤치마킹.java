package Test.gunwookim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CPU벤치마킹 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        long res = 0;
        for (int i = 2; i <= N; i++) {
            int num = Integer.parseInt(st.nextToken());
            dp[i] = (dp[i - 1] + 1) * num % 1000000007;
            res = (res + dp[i]) % 1000000007;
        }
        System.out.println(res);
    }
}
