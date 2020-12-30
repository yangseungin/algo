package round.r690;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // len
            String str = br.readLine();
            boolean flag = false;
            for (int i = 0; i <= 4; i++) {
                int sec = 4 - i;
                if ((str.substring(0, i) + str.substring(n - sec)).equals("2020"))
                    flag = true;

            }
            if (flag)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.println(sb);


    }
}
