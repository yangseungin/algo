package round.r690;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String input = br.readLine();
            if (input.length() == 1)
                sb.append(input + "\n");
            else {
                int idx = 9;
                StringBuilder tmp = new StringBuilder();
                int num = Integer.parseInt(input);
                boolean flag = true;
                while (num - idx > 0) {
                    tmp.append(idx);
                    num -= idx;
                    idx--;
                    if (idx == 0 && num > 0) {
                        sb.append(-1 + "\n");
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    sb.append(tmp.append(num).reverse() + "\n");
            }
        }
        System.out.println(sb);
    }
}
