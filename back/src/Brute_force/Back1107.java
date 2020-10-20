package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int N = Integer.parseInt(num);
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] targetNum = new int[6];
        for (int i = 0; i < num.length(); i++)
            targetNum[i] = num.charAt(i) - '0';

        boolean[] broken = new boolean[10];
        for (int i = 0; i < M; i++)
            broken[Integer.parseInt(st.nextToken())] = true;

        int min = Math.abs(N - 100);

        for (int i = 0; i <= 888888; i++) {
            boolean flag = false;
            String cur = String.valueOf(i);
            int len = cur.length();
            for (int j = 0; j < len; j++) {
                int val = cur.charAt(j) - '0';

                if (!check(broken, val)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                min = Math.min(min, Math.abs(i - N) + len);
            }
        }
        System.out.println(min);
    }

    private static boolean check(boolean[] broken, int val) {
        if (broken[val]) {
            return false;
        }
        return true;
    }
}
