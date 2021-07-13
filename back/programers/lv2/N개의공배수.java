package lv2;

public class N개의공배수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 6, 8, 14}));
    }

    public static int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = answer * arr[i] / gcd(answer, arr[i]);
        }
        return answer;
    }


    static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int tmp = num1 % num2;
            num1 = num2;
            num2 = tmp;
        }
        return num1;
    }
}
