package lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LottoHighLowRank {
    //로또의 최고 순위와 최저 순위
    //https://programmers.co.kr/learn/courses/30/lessons/77484
    static Map<Integer, Integer> result;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int matchCount = 0;
        result = new HashMap<>();
        result.put(6, 1);
        result.put(5, 2);
        result.put(4, 3);
        result.put(3, 4);
        result.put(2, 5);

        Set<Integer> set = new HashSet<>();
        for (int num : win_nums) {
            set.add(num);
        }

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (set.contains(num)) {
                set.remove(num);
                matchCount++;
            }
        }
        answer[0] = getRank(matchCount + zeroCount);
        answer[1] = getRank(matchCount);


        return answer;
    }

    private static int getRank(int matchCount) {
        if (matchCount >= 2) {
            return result.get(matchCount);
        }
        return 6;
    }
}
