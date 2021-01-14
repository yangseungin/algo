package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back3085 {
    static int N, max;
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++)
                arr[i] = input.toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                //가로스왑
                char tmp = arr[i][j];
                arr[i][j] = arr[i][j + 1];
                arr[i][j + 1] = tmp;
                check();
                tmp = arr[i][j + 1];
                arr[i][j + 1] = arr[i][j];
                arr[i][j] = tmp;

                //세로스왑
                tmp = arr[j][i];
                arr[j][i] = arr[j + 1][i];
                arr[j + 1][i] = tmp;
                check();
                tmp = arr[j + 1][i];
                arr[j + 1][i] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
        System.out.println(max);
    }

    private static void check() {
        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 1; j < N; j++) {
                if (arr[i][j] == arr[i][j - 1])
                    cnt++;
                else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
            max = Math.max(max, cnt);

        }
        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 1; j < N; j++) {
                if (arr[j][i] == arr[j - 1][i])
                    cnt++;
                else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
            max = Math.max(max, cnt);
        }
    }
}
