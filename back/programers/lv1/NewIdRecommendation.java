package lv1;

public class NewIdRecommendation {
    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
    }

    public static String solution(String new_id) {
        // 1단계
        String answer = new_id.toLowerCase();

        // 2단계
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        // 3단계
        String step3 = answer.toString().replace("..", ".");
        while (step3.contains("..")) {
            step3 = step3.replace("..", ".");
        }
        // 4단계

        answer = step3.replaceAll("^[.]|[.]$", "");

        // 5단계
        if (answer.equals("")) {
            answer += "a";
        }
        // 6단계
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        // 7단계
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }

        return answer;
    }
}
