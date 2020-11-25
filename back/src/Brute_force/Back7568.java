package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] spec = new int[N][2];
        int[] rank = new int[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            spec[i][0] = Integer.parseInt(st.nextToken());
            spec[i][1] = Integer.parseInt(st.nextToken());
            rank[i]++;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (spec[i][0] > spec[j][0] && spec[i][1] > spec[j][1])
                    rank[j]++;
            }
        }

        for (int i = 0; i < N; i++)
            System.out.print(rank[i]+" ");


    }
}
