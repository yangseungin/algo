package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back16433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
        char[][] arr = new char[N][N];
        boolean flag = true;
        if ((R + C) % 2 == 1) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if ((i + j) % 2 == 1)
                        arr[i][j] = 'v';
                    else
                        arr[i][j] = '.';
                }
            }
        } else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if ((i + j) % 2 == 1)
                        arr[i][j] = '.';
                    else
                        arr[i][j] = 'v';
                }
            }

        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }

    }
}
