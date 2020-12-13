package Test.gunwookim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int idx = 1;
        int mol = 1;    //분자
        int deno = 1;     //분모
        while (true) {
            if (N > idx)
                N -= idx;
            else
                break;
            idx++;
        }
        if (idx % 2 == 1) {
            mol = idx;
            for (int i = 1; i < N; i++) {
                mol -= 1;
                deno += 1;
            }
        } else {
            deno = idx;
            for (int i = 1; i < N; i++) {
                mol += 1;
                deno -= 1;
            }
        }
        System.out.println(mol + "/" + deno);
    }
}
