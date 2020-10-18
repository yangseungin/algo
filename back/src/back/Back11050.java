package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]), K = Integer.parseInt(s[1]);
        System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
    }

    public static int factorial(int n) {
        int res=1;
        for(int i=1; i<=n;i++)
            res*=i;
        return res;
    }
}
