package set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Back7662 {
    static TreeMap<Long, Long> map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());
        for (int tc = 0; tc < T; tc++) {
            map = new TreeMap<>();
            st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            for (int k = 0; k < K; k++) {
                st = new StringTokenizer(br.readLine());
                char c = st.nextToken().charAt(0);
                long n = Long.parseLong(st.nextToken());
                if (c == 'I') {
                    if (map.containsKey(n)) map.put(n, map.get(n) + 1);
                    else map.put(n, 1L);
                } else if (c == 'D') {
                    if (map.isEmpty())
                        continue;
                    if (n == -1) {
                        long min = map.firstKey();
                        long next = map.get(min) - 1;
                        if (next == 0)
                            map.remove(min);
                        else
                            map.put(min, next);
                    } else if (n == 1) {
                        long maxKey = map.lastKey();
                        long next = map.get(maxKey) - 1;
                        if (next == 0)
                            map.remove(maxKey);
                        else
                            map.put(maxKey, next);
                    }
                }
            }
            if (map.isEmpty())
                sb.append("EMPTY\n");
            else
                sb.append(map.lastKey() + " " + map.firstKey() + "\n");
        }
        System.out.println(sb.toString());
    }
}