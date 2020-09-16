package back;

import java.util.Scanner;

public class Back2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        int intB = sc.nextInt();
        int intV = sc.nextInt();
        int result = 0, low = 0, high = intV, mid = intV / 2, oneDayMove = intA - intB;

        while (true) {
            result = mid / oneDayMove;
            if (intV - (oneDayMove * result) > intA) {
                low = mid;
            } else if (intV - (oneDayMove * result) == intA) {
                break;
            } else {
                if (mid + intA - intV >= oneDayMove) {
                    high = mid;
                } else {
                    break;
                }
            }
            mid = (high + low) / 2;
        }

        System.out.println(result + 1);

    }
}
