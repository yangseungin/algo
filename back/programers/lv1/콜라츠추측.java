package lv1;

public class 콜라츠추측 {
    //    https://programmers.co.kr/learn/courses/30/lessons/12943
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
    }

    public static int solution(int num) {
        int answer = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = 3 * num + 1;
            }
            answer++;
            if (answer == 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}
