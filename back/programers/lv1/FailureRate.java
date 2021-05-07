package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FailureRate {
    //    실패율
//    https://programmers.co.kr/learn/courses/30/lessons/42889
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
    }

    public static int[] solution(int N, int[] stages) {
        List<Stage> stageList = new ArrayList<>();

        for (int i = 1; i < N + 1; i++) {
            int now = 0, clear = 0;
            for (int stage : stages) {
                if (i <= stage) {
                    clear++;
                }
                if (i == stage) {
                    now++;
                }
            }
            if (clear == 0) {
                stageList.add(new Stage(i, 0));
            } else {
                stageList.add(new Stage(i, (double) now / clear));
            }
        }
        Collections.sort(stageList, (o1, o2) -> {
            if (o1.failureRate == o2.failureRate) {
                return o1.num < o2.num ? -1 : 1;
            } else {
                return o1.failureRate > o2.failureRate ? -1 : 1;
            }
        });
        return stageList.stream().mapToInt(Stage::getNum).toArray();
    }

    static class Stage {
        int num;
        double failureRate;

        public int getNum() {
            return num;
        }

        public Stage(int num, double failureRate) {
            this.num = num;
            this.failureRate = failureRate;
        }

    }
}
