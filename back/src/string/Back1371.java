package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int[] alpha = new int[26];
        while ((input = br.readLine()) != null) {
            for (char c : input.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    alpha[c - 'a']++;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, alpha[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (alpha[i] == max)
                sb.append((char) ('a' + i));
        }
        System.out.println(sb);
    }
}
