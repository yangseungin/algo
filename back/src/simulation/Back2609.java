package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken()), num2 = Integer.parseInt(st.nextToken());
        if (num1 > num2) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        int gcd = getGcd(num1, num2);
        System.out.println(gcd);
        System.out.println(num1 * num2 / gcd);
    }

    public static int getGcd(int x, int y) {
        while (y > 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }
}
