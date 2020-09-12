package back;

import java.io.IOException;
import java.util.Scanner;

public class Back14681 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int intX = sc.nextInt();
        int intY = sc.nextInt();

        if (intX > 0) {
            if (intY > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (intY > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}
