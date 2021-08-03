package weeklychallenge;

public class 부족한금액계산하기 {
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    public static long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }

        return sum < money ? 0 : sum - money;
    }
}
