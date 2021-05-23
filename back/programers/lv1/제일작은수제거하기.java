package lv1;

import java.util.Arrays;

public class 제일작은수제거하기 {
    //    https://programmers.co.kr/learn/courses/30/lessons/12935
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));
    }

    public static int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{-1};
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(value -> value != min).toArray();
    }
}
