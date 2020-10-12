package set_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Back1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < N; i++) {
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 0) + 1);
            if (map.get(book) > max)
                max = map.get(book);
        }
        List<String> list = new ArrayList<>();
        for (String key : map.keySet())
            if (map.get(key) == max)
                list.add(key);
        list.sort(Comparator.naturalOrder());

        System.out.println(list.get(0));
    }
}
