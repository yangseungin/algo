package lv3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class N으로표현 {
    static Set<Integer>[] dp = new HashSet[9];

    //https://programmers.co.kr/learn/courses/30/lessons/42895
    public static void main(String[] args) {
        System.out.println(solution(5, 12));
        System.out.println(solution(2, 11));
        System.out.println(solution(5, 31168));

    }

    public static int solution(int N, int number) {
        if (N == number) {
            return 1;
        }
        for (int i = 0; i < 9; i++) {
            dp[i] = new HashSet<>();
        }
        dp[1].add(N);
        String strN = String.valueOf(N);
        for (int i = 2; i <= 8; i++) {
            strN += String.valueOf(N);
            dp[i].add(Integer.parseInt(strN));
            for (int j = 1; j < i; j++) {
                calNum(j, i);
                if (dp[i].contains(number)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static void calNum(int count1, int count2) {
        Iterator<Integer> iterator = dp[count1].iterator();
        Iterator<Integer> iterator2 = dp[count2 - count1].iterator();

        while (iterator.hasNext()) {
            int numA = iterator.next();

            while (iterator2.hasNext()) {
                int numB = iterator2.next();
                dp[count2].add(numA + numB);
                dp[count2].add(numA - numB);
                dp[count2].add(numA * numB);
                if (numB != 0)
                    dp[count2].add(numA / numB);

            }
            iterator2 = dp[count2 - count1].iterator();
        }
    }
}
