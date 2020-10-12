package set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Back1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++)
            set.add(br.readLine());

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (set.contains(name))
                list.add(name);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();

        sb.append(list.size() + "\n");
        for (String name : list)
            sb.append(name + "\n");
        System.out.println(sb.toString());

    }
}
