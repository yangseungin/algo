package lv2;

import java.util.ArrayList;
import java.util.List;

public class 캐시 {
    private static final int CASH_HIT = 1;
    private static final int CASH_MISS = 5;

    public static void main(String[] args) {
        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }

    public static int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0)
            return cities.length * CASH_MISS;

        int answer = 0;
        List<String> cache = new ArrayList<>();
        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toUpperCase();
            if (cache.contains(cities[i])) {
                cache.remove(cities[i]);
                cache.add(cities[i]);
                answer += CASH_HIT;
            } else {
                if (cache.size() == cacheSize) {
                    cache.remove(0);
                }
                cache.add(cities[i]);
                answer += CASH_MISS;
            }
        }
        return answer;

    }
}
