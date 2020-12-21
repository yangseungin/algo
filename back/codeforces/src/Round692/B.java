package Round692;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());
            while (cal(n)) {
                n++;
            }
            sb.append(n + "\n");

        }
        System.out.println(sb);

    }

    private static boolean cal(long n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit != 0 && n % digit != 0) {
                return true;
            }
        }
        return false;
    }

}
