package lv1;

public class AddNegativePositiveNumbers {
    // 음양 더하기
    // https://programmers.co.kr/learn/courses/30/lessons/76501
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
        System.out.println(solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}));

    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }

        return answer;
    }
}
