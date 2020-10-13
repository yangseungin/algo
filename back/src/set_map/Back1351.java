package set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Back1351 {
    static Map<Long, Long> map;
    static Long N, P, Q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Long.parseLong(st.nextToken());
        P = Long.parseLong(st.nextToken());
        Q = Long.parseLong(st.nextToken());
        long res = 0;
        map = new HashMap<>();
        map.put(0L, 1L);
        System.out.println(getValue(N));
    }

    public static Long getValue(Long num) {
        if (map.containsKey(num))
            return map.get(num);
        else {
            map.put(num, getValue(num / P) + getValue(num / Q));
            return map.get(num);
        }
    }
}
