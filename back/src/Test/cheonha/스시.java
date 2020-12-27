package Test.cheonha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 스시 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] sushi = new int[26];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++)
                sushi[s.charAt(j) - 'A']++;

        }
        for (int i = 0; i < sushi.length; i++)
            sum += sushi[i];

        System.out.println(sum);

    }
}
