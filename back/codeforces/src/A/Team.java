package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Team {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int tmp = 0;
            while (st.hasMoreTokens()) {
                if (Integer.parseInt(st.nextToken()) == 1)
                    tmp++;
            }
            if (tmp >= 2)
                cnt++;
        }
        System.out.println(cnt);

    }
}
