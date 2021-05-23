package lv1;

public class 시저암호 {
    //    https://programmers.co.kr/learn/courses/30/lessons/12926
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
    }

    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                c = (char) (c + n);
                if (c > 'z') {
                    c -= 26;
                }
            } else if (Character.isUpperCase(c)) {
                c = (char) (c + n);
                if (c > 'Z') {
                    c -= 26;
                }
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
