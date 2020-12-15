package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back15663 {
    static int[] arr, input;
    static boolean[] visited;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        input = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            input[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(input);
        sb = new StringBuilder();
        dfs(N, M, 0);
        System.out.println(sb);

    }

    private static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int num : arr)
                sb.append(num + " ");
            sb.append("\n");
            return;
        }
        int before = -1;
        for (int i = 0; i < N; i++) {
            if (!visited[i] && before != input[i]) {
                visited[i] = true;
                arr[depth] = input[i];
                before = input[i];
                dfs(N, M, depth + 1);
                visited[i] = false;
            }
        }
    }
}
