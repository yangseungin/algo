package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back15657 {
    static int[] arr, input;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        input = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            input[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(input);
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
        for (int i = idx - 1; i < N; i++) {
            arr[depth] = input[i];
            dfs(N, M, depth + 1, i + 1);
        }
    }
}
