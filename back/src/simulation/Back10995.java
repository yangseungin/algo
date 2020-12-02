package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back10995 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (i % 2 == 1)
                System.out.print(" ");
            for (int j = 0; j < N; j++)
                System.out.print("* ");

            System.out.println();

        }

    }
}
