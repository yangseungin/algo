package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[31];
        for (int i = 1; i <= 28; i++) {
            int input = Integer.parseInt(br.readLine());
            arr[input]++;
        }
        for (int i = 1; i <= 30; i++) {
            if (arr[i] != 1)
                System.out.println(i);
        }
    }
}
