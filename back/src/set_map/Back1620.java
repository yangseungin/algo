package set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Back1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        Map<String, String> map = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map.put(name, String.valueOf(i));
            map.put(String.valueOf(i), name);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(map.get(br.readLine()) + "\n");
        }
        System.out.println(sb.toString());

    }
}
