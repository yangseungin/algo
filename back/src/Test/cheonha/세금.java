package Test.cheonha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세금 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println((int) (N * 0.78) + " " + (int) (N - N * 0.2 * 0.22));
    }
}
