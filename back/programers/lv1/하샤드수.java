package lv1;

public class 하샤드수 {
    //    https://programmers.co.kr/learn/courses/30/lessons/12947
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(11));
        System.out.println(solution(12));

    }

    public static boolean solution(int x) {
        int tmp = x;
        int sum = 0;
        while (tmp != 0) {
            sum += tmp % 10;
            tmp /= 10;
        }

        return x % sum == 0 ? true : false;
    }
}
