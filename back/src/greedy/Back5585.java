package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back5585 {
    public static void main(String[] args) throws IOException {
        int[] coin = new int[]{500, 100, 50, 10, 5, 1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        N = 1000 - N;

        int idx = 0;
        while (N > 0) {
            if (N >= coin[idx]) {
                N -= coin[idx];
                count++;
            } else
                idx++;
        }
        System.out.println(count);
    }
}