package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int res = 0;
        int bar = 64;
        while (X > 0) {
            if (bar > X) {
                bar /= 2;
            } else {
                X -= bar;
                res++;
            }
        }
        System.out.println(res);
    }
}
