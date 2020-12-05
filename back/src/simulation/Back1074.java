package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = (int) Math.pow(2, N);

        int x = 0, y = 0;
        int res = 0;
        while (n > 0) {
            n /= 2;
            if (r < x + n && c < y + n)
                res += n * n * 0;
            else if (r < x + n) {
                res += n * n * 1;
                y += n;
            } else if (c < y + n) {
                res += n * n * 2;
                x += n;
            } else {
                res += n * n * 3;
                x += n;
                y += n;
            }

            if (n == 1) {
                System.out.println(res);
                break;
            }
        }
    }
}
