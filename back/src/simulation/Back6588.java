package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Back6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean prime[] = new boolean[1000001];
        Arrays.fill(prime, true);
        for (int i = 2; i <= 1000000; i++) {
            for (int j = i * 2; j <= 1000000; j += i) {
                if (!prime[j])
                    continue;
                prime[j] = false;
            }
        }
        StringBuilder sb = new StringBuilder();
        String input = "";
        while (!(input = br.readLine()).equals("0")) {
            boolean wrong = true;
            int num = Integer.parseInt(input);
            for (int i = 2; i <= num / 2; i++) {
                if (prime[i] && prime[num - i]) {
                    sb.append(num + " = " + i + " + " + (num - i) + "\n");
                    wrong = false;
                    break;
                }
            }
            if (wrong)
                sb.append("Goldbach's conjecture is wrong.\n");
        }
        System.out.println(sb);
    }
}