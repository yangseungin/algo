package Round692;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int idx = -1, cnt = 0;
            for (int i = str.length() - 1; i >= 0; i--) {
                if (str.charAt(i) == ')') {
                    cnt++;
                    continue;
                }
                idx = i;
                break;
            }
//            System.out.println(idx + " / " + cnt);
            if (idx + 1 < cnt)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.println(sb);

    }
}
