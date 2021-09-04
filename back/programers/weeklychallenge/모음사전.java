package weeklychallenge;

public class 모음사전 {
    public static void main(String[] args) {
        System.out.println(solution("AAAAE"));//    6
        System.out.println(solution("I"));  //      1563
        System.out.println(solution("EIO"));//      1189

    }

    public static int solution(String word) {
        char c[] = {'A', 'E', 'I', 'O', 'U'};
        int answer = 0;
        int diff = 781;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (c[j] == word.charAt(i)) {
                    answer += j * diff + 1;
                }
            }
            diff = (diff - 1) / 5;
        }

        return answer;
    }
}
