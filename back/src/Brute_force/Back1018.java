package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int min = 0, min2 = 0, res = Integer.MAX_VALUE;
        final String[] chess1 = {
                "WBWBWBWB", "BWBWBWBW",
                "WBWBWBWB", "BWBWBWBW",
                "WBWBWBWB", "BWBWBWBW",
                "WBWBWBWB", "BWBWBWBW"
        };
        final String[] chess2 = {
                "BWBWBWBW", "WBWBWBWB",
                "BWBWBWBW", "WBWBWBWB",
                "BWBWBWBW", "WBWBWBWB",
                "BWBWBWBW", "WBWBWBWB"
        };

        String[] board = new String[N];
        for (int i = 0; i < N; i++)
            board[i] = br.readLine();

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                for (int k = i; k < i + 8; k++) {
                    String sub = board[k].substring(j, j + 8);
                    if (!sub.equals(chess1[k - i])) {
                        for (int l = 0; l < 8; l++) {
                            if (chess1[k - i].charAt(l) != sub.charAt(l)) {
                                min++;
                            }
                        }
                    }
                    if (!sub.equals(chess2[k - i])) {
                        for (int l = 0; l < 8; l++) {
                            if (chess2[k - i].charAt(l) != sub.charAt(l)) {
                                min2++;
                            }
                        }
                    }
                }
                res = Math.min(res, Math.min(min, min2));
                min = 0;
                min2 = 0;
            }
        }
        System.out.println(res);
    }
}
