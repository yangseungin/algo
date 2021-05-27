package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back1759 {
    static char[] arr;
    static boolean[] result;
    static int L, C;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        String[] str = br.readLine().split(" ");
        arr = new char[C];
        result = new boolean[C];

        for (int i = 0; i < C; i++) {
            arr[i] = str[i].charAt(0);
        }

        Arrays.sort(arr);
        DFS(0, 0, 0, 0);
        System.out.println(sb);
    }

    public static void DFS(int start, int depth, int ja, int mo) {
        if (depth == L && ja >= 2 && mo >= 1) {
            for (int i = 0; i < C; i++) {
                if (result[i]) {
                    sb.append(arr[i]);
                }
            }
            sb.append("\n");
        }

        for (int i = start; i < C; i++) {
            result[i] = true;
            DFS(i + 1, depth + 1, ja + (!moCheck(arr[i]) ? 1 : 0), mo + (moCheck(arr[i]) ? 1 : 0));
            result[i] = false;
        }
    }

    public static boolean moCheck(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}
