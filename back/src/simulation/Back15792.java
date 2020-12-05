package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Back15792 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken(), B = st.nextToken();
        System.out.println(new BigDecimal(A).divide(new BigDecimal(B), 1000, BigDecimal.ROUND_HALF_DOWN));

    }
}
