package Round690;

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
            for (int i = 0; i < n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.println(str.substring(0, i) +" / "+ str.substring(i, j)+" / "+str.substring(j, n)+" / "+(str.substring(0, i) + str.substring(j, n)));
                    if (str.substring(0, i).equals("2020") || str.substring(i, j).equals("2020") || str.substring(j, n).equals("2020") || (str.substring(0, i) + str.substring(j, n)).equals("2020")) {
                        flag = true;
                        break;
                    }
                }
                if(flag)
                    break;
            }
            if (flag)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.println(sb);


    }
}
