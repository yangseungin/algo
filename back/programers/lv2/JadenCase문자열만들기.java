package lv2;

public class JadenCase문자열만들기 {
    //    https://programmers.co.kr/learn/courses/30/lessons/12951
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
    }

    public static String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        String firstStr = String.valueOf(s.charAt(0));
        sb.append(firstStr.toUpperCase());

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append(" ");
            } else if (s.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

