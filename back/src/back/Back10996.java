package back;

import java.util.Scanner;

public class Back10996 {
    private static boolean toggle = true;

    public static void main(String[] args) {
        //별직기 -21
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 1) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();

        }
    }


}
