package lv2;

public class 숫자의표현 {
    //    https://programmers.co.kr/learn/courses/30/lessons/12924
    public static void main(String[] args) {
        System.out.println(solution(15));

    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n + 1; i++) {
            int sum = 0;
            for (int j = i; j < n + 1; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}
