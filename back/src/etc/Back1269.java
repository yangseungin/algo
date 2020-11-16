package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Back1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[N + 1];

        st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < M; i++)
            set.add(Integer.parseInt(st.nextToken()));

        int cnt = 0;
        for (int i = 0; i < N; i++)
            if (set.contains(arr[i]))
                cnt++;

        System.out.println(N + M - (cnt * 2));
    }
}
