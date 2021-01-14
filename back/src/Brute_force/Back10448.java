package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[46];
        int[] res = new int[3106];
        for (int i = 1; i <= 45; i++)
            arr[i] = i * (i + 1) / 2;
        for (int i = 1; i <= 45; i++) {
            for (int j = 1; j <= 45; j++) {
                for (int k = 1; k <= 45; k++) {
                    res[arr[i] + arr[j] + arr[k]] = 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            if (res[N] == 1)
                sb.append(1 + "\n");
            else
                sb.append(0 + "\n");
        }
        System.out.println(sb);
    }
}
