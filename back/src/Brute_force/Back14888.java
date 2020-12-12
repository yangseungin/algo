package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back14888 {
    static int N, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    static int[] arr, oper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        oper = new int[4];    // + - * /
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++)
            oper[i] = Integer.parseInt(st.nextToken());
        dfs(arr[0], 1);
        System.out.println(max);
        System.out.println(min);

    }

    private static void dfs(int num, int idx) {
        if (idx == N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (oper[i] > 0) {
                oper[i]--;
                switch (i) {
                    case 0:
                        dfs(num + arr[idx], idx + 1);
                        break;
                    case 1:
                        dfs(num - arr[idx], idx + 1);
                        break;
                    case 2:
                        dfs(num * arr[idx], idx + 1);
                        break;
                    case 3:
                        dfs(num / arr[idx], idx + 1);
                        break;
                }

                oper[i]++;
            }
        }
    }
}
