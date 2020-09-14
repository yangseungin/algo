package back;

import java.util.Scanner;

public class Back1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), result=0;
        if (n < 100) {
            System.out.println(n);
        } else {
            result=99;
            for(int i=100;i<=n;i++){
                if(isHan(i)){
                    result++;
                }
            }
            System.out.println(result);
        }



    }

    private static boolean isHan(int num) {
        if(num == 1000) return false;
        return false;
    }
}
