package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1673 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String s = "";
        while ((s = br.readLine()) != null) {
            st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            int chicken = n;

            while (n / k != 0) {
                chicken += n / k;
                n = n / k + n % k;
            }
            sb.append(chicken + "\n");
        }
        System.out.println(sb);
    }
}
