package education.r102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (cnt-- > 0) {
            String s = br.readLine();
            String t = br.readLine();
            if (s.length() == t.length()) {
                if (s.equals(t))
                    sb.append(s + "\n");
                else
                    sb.append(-1 + "\n");
            } else {
                int lcm = getLCM(s.length(), t.length());
                StringBuilder ss = new StringBuilder(s);
                StringBuilder tt = new StringBuilder(t);

                for (int i = 0; i < lcm / s.length() - 1; i++)
                    ss.append(s);

                for (int i = 0; i < lcm / t.length() - 1; i++)
                    tt.append(t);

                if (ss.toString().equals(tt.toString()))
                    sb.append(ss + "\n");
                else
                    sb.append(-1 + "\n");
            }
        }
        System.out.println(sb);
    }

    public static int getLCM(int len1, int len2) {
        return len1 * len2 / getGCD(len1, len2);
    }

    public static int getGCD(int len1, int len2) {
        if (len2 == 0)
            return len1;
        return getGCD(len2, len1 % len2);
    }

}
