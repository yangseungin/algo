package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Back2668 {
    static boolean[] visited;
    static int[] arr;
    static int last = 0;
    static List<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        visited = new boolean[N + 1];
        list = new ArrayList<>();

        for (int i = 1; i <= N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            visited[i] = true;
            last = i;
            dfs(i);
            visited[i] = false;
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(list.size() + "\n");
        for (int i = 0; i < list.size(); i++)
            sb.append(list.get(i) + "\n");
        System.out.println(sb);
    }

    private static void dfs(int i) {
        if (!visited[arr[i]]) {
            visited[arr[i]] = true;
            dfs(arr[i]);
            visited[arr[i]] = false;
        }
        if (arr[i] == last)
            list.add(last);

    }

}
