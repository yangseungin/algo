package kakao.intern;

import java.util.*;

public class 보석쇼핑 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"}));
//		System.out.println(solution(new String[]{"AA", "AB", "AC", "AA", "AC"}));
//		System.out.println(solution(new String[]{"XYZ", "XYZ", "XYZ"}));

    }

    public static int[] solution(String[] gems) {
        int length = Integer.MAX_VALUE;
        Set<String> set = new HashSet<>();
        for (String gem : gems)
            set.add(gem);

        Map<String, Integer> map = new HashMap<>();
        Queue<String> que = new LinkedList<>();

        int start = 0, first = 0;
        for (int i = 0; i < gems.length; i++) {
            if (map.containsKey(gems[i]))
                map.put(gems[i], map.get(gems[i]) + 1);
            else
                map.put(gems[i], 1);

            que.add(gems[i]);

            while (true) {
                String peek = que.peek();
                if (map.get(peek) > 1) {
                    map.put(peek, map.get(peek) - 1);
                    que.poll();
                    first++;
                } else {
                    break;
                }
            }

            if (map.size() == set.size() && length > que.size()) {
                length = que.size();
                start = first;
            }
        }

        return new int[]{start + 1, start + length};
    }
}
