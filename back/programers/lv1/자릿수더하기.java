package lv1;

public class 자릿수더하기 {
//    https://programmers.co.kr/learn/courses/30/lessons/12931
    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(987));
    }
    public static int solution(int n) {
        int answer = 0;
        for(char c:String.valueOf(n).toCharArray()){
            answer+=c-'0';
        }
        return answer;
    }
}
