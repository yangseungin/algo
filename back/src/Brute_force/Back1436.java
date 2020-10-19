package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 0;

        while (N > 0) {
            num++;
            String s = String.valueOf(num);

            if (s.contains("666"))
                N--;
        }
        System.out.println(num);
    }
}
