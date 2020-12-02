package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back15947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int repeat = N / 14;
        N %= 14;
        switch (N) {
            case 0:
            case 2:
                System.out.println("sukhwan");
                break;
            case 1:
            case 13:
                System.out.println("baby");
                break;
            case 5:
                System.out.println("very");
                break;
            case 6:
                System.out.println("cute");
                break;
            case 9:
                System.out.println("in");
                break;
            case 10:
                System.out.println("bed");
                break;
            case 3:
            case 7:
            case 11:
                if (repeat == 0) System.out.println("tururu");
                else if (repeat == 1) System.out.println("turururu");
                else if (repeat == 2) System.out.println("tururururu");
                else System.out.println("tu+ru*" + (repeat + 2));
                break;
            case 4:
            case 8:
            case 12:
                if (repeat == 0) System.out.println("turu");
                else if (repeat == 1) System.out.println("tururu");
                else if (repeat == 2) System.out.println("turururu");
                else if (repeat == 3) System.out.println("tururururu");
                else System.out.println("tu+ru*" + (repeat + 1));
                break;
        }
    }
}
