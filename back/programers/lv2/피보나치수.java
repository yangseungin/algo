package lv2;

public class 피보나치수 {
    //    https://programmers.co.kr/learn/courses/30/lessons/12945
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        int answer = 0;
        int first = 1;
        int second = 1;

        if (n == 2) {
            return 1;
        }

        for (int i = 3; i <= n; i++) {
            answer = (first + second) % 1234567;
            first = second;
            second = answer;
        }
        return answer;
    }
}
