package page1;

public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
        System.out.println(myPow(2.10000, 3));


    }

    public static double myPow(double x, int n) {
        if (n == 0)
            return 1;
        else if (n < 0) {
            double tmp = myPow(x, n / 2 * -1);
            if ((n * -1) % 2 == 0) {
                return 1 / (tmp * tmp);
            }
            return 1 / (tmp * tmp * x);
        } else {
            double tmp = myPow(x, n / 2);
            if (n % 2 == 0) {
                return tmp * tmp;
            }
            return tmp * tmp * x;
        }
    }
}
