package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1850 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken()), B = Long.parseLong(st.nextToken());
        if (B > A) {
            long tmp = A;
            A = B;
            B = tmp;
        }

        long gcd = getGcd(A, B);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gcd; i++)
            sb.append(1);
        System.out.println(sb);
    }

    public static long getGcd(long a, long b) {
        while (b > 0) {
            long tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}
