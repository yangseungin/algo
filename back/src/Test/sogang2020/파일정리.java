package Test.sogang2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class 파일정리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split("\\.");
            map.put(split[1], map.getOrDefault(split[1], 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        TreeMap<String, Integer> treeMap = new TreeMap<>(map);
        for (String key : treeMap.keySet())
            sb.append(key + " " + map.get(key)+"\n");
        System.out.println(sb);
    }

}
