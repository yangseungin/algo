package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheatreSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken());
        long cntN = n / a;
        long cntM = m / a;
        if (n % a != 0)
            cntN++;

        if (m % a != 0)
            cntM++;


        System.out.println(cntN * cntM);

    }
}
