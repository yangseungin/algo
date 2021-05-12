package lv2;

import java.util.Arrays;

public class 카펫 {
    //    https://programmers.co.kr/learn/courses/30/lessons/42842
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
        System.out.println(Arrays.toString(solution(8, 1)));
        System.out.println(Arrays.toString(solution(24, 24)));
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int i = yellow; i > 0; i--) {
            if (yellow % i != 0) {
                continue;
            }
            if ((i * 2) + (yellow / i) * 2 == brown - 4) {
                answer[1] = yellow / i + 2;
                answer[0] = i + 2;
                break;
            }
        }

        return answer;
    }
}
