package Test.hosuk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
    static int min = Integer.MAX_VALUE, max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dfs(N, getOdd(N));
        System.out.println(min + " " + max);
    }

    public static void dfs(int n, int odd) {
        if (n < 10) {
            min = Math.min(min, odd);
            max = Math.max(max, odd);
            return;
        } else if (n < 100) {
            int nextNum = n / 10 + n % 10;
            dfs(nextNum, getOdd(nextNum) + odd);
            return;
        } else {
            String str = Integer.toString(n);
            for (int i = 0; i <= str.length() - 3; i++) {
                for (int j = i + 1; j <= str.length() - 2; j++) {
                    String num1 = str.substring(0, i + 1);
                    String num2 = str.substring(i + 1, j + 1);
                    String num3 = str.substring(j + 1, str.length());
                    int nextNum = Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3);
                    dfs(nextNum, getOdd(nextNum) + odd);
                }
            }
        }
    }
    public static int getOdd(int n) {
        int cnt = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 1)
                cnt++;
            n /= 10;
        }
        return cnt;
    }
}
