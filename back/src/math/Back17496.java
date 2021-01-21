package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back17496 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int count = 0;
        int day = T + 1;
        while (day <= N) {
            count += C;
            day += T;
        }
        System.out.println(count * P);

    }
}
