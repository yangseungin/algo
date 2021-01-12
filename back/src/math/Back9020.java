package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back9020 {

    public static void main(String[] args) throws IOException {
        boolean[] prime = new boolean[10001];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i])
                continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int first = n / 2;
            int second = n / 2;

            while (true) {
                if (!prime[first] && !prime[second]) {
                    System.out.println(first + " " + second);
                    break;
                }
                first--;
                second++;
            }
        }

    }
}
