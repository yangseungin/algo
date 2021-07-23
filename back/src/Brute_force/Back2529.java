package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Back2529 {
    static int N;
    static char[] arr = new char[10];
    private static boolean[] visited = new boolean[10];
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = st.nextToken().charAt(0);
        }
        dfs("", 0);
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
        System.out.println(list.get(0));

    }

    private static void dfs(String num, int idx) {
        if (idx == N + 1) {
            list.add(num);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (!visited[i] && (idx == 0 || check(Character.getNumericValue(num.charAt(idx - 1)), i, arr[idx - 1]))) {
                visited[i] = true;
                dfs(num + i, idx + 1);
                visited[i] = false;
            }
        }
    }

    private static boolean check(int a, int b, char c) {
        if (c == '<' && a > b) {
            return false;
        } else if (c == '>' && a < b) {
            return false;
        }
        return true;
    }
}
