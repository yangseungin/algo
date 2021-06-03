package lv2;

import java.util.Arrays;

public class 이진변환반복하기 {
    //    https://programmers.co.kr/learn/courses/30/lessons/70129
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];
        while (!s.equals("1")) {
            answer[0]++;
            String tmp = s.replaceAll("0", "");
            answer[1] += s.length() - tmp.length();
            s = Integer.toBinaryString(tmp.length()).toString();
        }
        return answer;
    }
}
