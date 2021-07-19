package Test.gahui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 가희와키워드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String[] split = br.readLine().split(",");
            for (String str : split) {
                if (set.contains(str)) {
                    set.remove(str);
                }
            }
                sb.append(set.size() + "\n");
        }
        System.out.println(sb);
    }
}
