package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back15652 {
    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        sb = new StringBuilder();
        dfs(N, M, 0, 1);
        System.out.println(sb);

    }

    private static void dfs(int N, int M, int depth, int idx) {
        if (depth == M) {
            for (int num : arr)
                sb.append(num + " ");
            sb.append("\n");
            return;
        }
        for (int i = idx; i <= N; i++) {
            arr[depth] = i;
            dfs(N, M, depth + 1, i);
        }
    }
}
