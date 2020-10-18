package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = br.readLine();
            if (!!line.equals("0")) break;

            char[] chars = line.toCharArray();
            int start = 0, end = chars.length - 1;
            boolean flag = true;
            while (start < end) {
                if (chars[start] != chars[end]) {
                    flag = false;
                    break;
                }
                start++;
                end--;
            }
            if (flag)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
