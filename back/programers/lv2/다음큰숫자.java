package lv2;

public class 다음큰숫자 {
    //    https://programmers.co.kr/learn/courses/30/lessons/12911
    public static void main(String[] args) {
        System.out.println(solution(78));
        System.out.println(solution(15));
    }

    private static int solution(int n) {
        int answer = 0;
        int countOne = getCountOne(n);

        while (true) {
            n++;
            if (countOne == getCountOne(n)) {
                answer = n;
                break;
            }
        }

        return answer;
    }

    private static int getCountOne(int n) {
        int count = 0;
        String s = Integer.toBinaryString(n);

        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}

