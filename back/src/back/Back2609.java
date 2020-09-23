package back;

import java.util.Scanner;

public class Back2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = num1 * num2;
        if (num1 > num2) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        int tmp = num2 % num1;
        while (tmp != 0) {
            tmp = num2 % num1;
            num2 = num1;
            num1 = tmp;

        }
        System.out.println(num2);
        System.out.println(gcd / num2);


    }

}
