package lv1;

public class 이상한문자만들기 {
    //    https://programmers.co.kr/learn/courses/30/lessons/12930
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(' ');
                index = 0;
            } else {
                if (index % 2 != 0) {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                } else {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                }
                index++;
            }
        }

        return sb.toString();
    }
}
