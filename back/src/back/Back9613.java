package back;

import java.util.Scanner;

public class Back9613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = sc.nextInt();
            }
            int sum = 0;
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum += getGCD(nums[j], nums[k]);
                }
            }
            System.out.println(sum);

        }
    }

    public static int getGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return getGCD(num2, num1 % num2);
        }
    }
}
