package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long ans = 0;
        int len = 1;
        for (int i = 1; i <= N; i *= 10, len++) {
            int end = i * 10 - 1;
            if (end > N) {
                end = N;
            }

            ans += (long) (end - i + 1) * len;
        }
        System.out.println(ans);


    }
}
