package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            int H = Integer.parseInt(s[0]), W = Integer.parseInt(s[1]), N = Integer.parseInt(s[2]);
            int tmp = N % H;
            int tmp2 = (N / H) + 1;
            if (tmp == 0)
                System.out.println(H * 100 + N / H);
            else
                System.out.println(tmp * 100 + tmp2);
        }
    }
}
