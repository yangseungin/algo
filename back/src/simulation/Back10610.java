package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        long sum = 0;
        int[] arr = new int[10];
        for (int i = 0; i < input.length(); i++) {
            int tmp = input.charAt(i) - '0';
            arr[tmp]++;
            sum += tmp;
        }
        if (arr[0] == 0 || sum % 3 != 0)
            System.out.println(-1);
        else {
            StringBuilder sb = new StringBuilder();
            for (int i = 9; i >= 0; i--) {
                while (arr[i] > 0) {
                    sb.append(i);
                    arr[i]--;
                }
            }
            System.out.println(sb);
        }

    }
}
