package set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Back14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        int res = 0;
        for (int i = 0; i < N; i++)
            set.add(br.readLine());
        for (int i = 0; i < M; i++)
            if (set.contains(br.readLine()))
                res++;

        System.out.println(res);
    }
}
