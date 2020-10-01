package array_vectorsort_stringparsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back13420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean flag;
        for (int i = 0; i < T; i++) {
            flag = false;
            StringTokenizer st = new StringTokenizer(br.readLine());
            long num1 = Long.parseLong(st.nextToken());
            String cal = st.nextToken();
            long num2 = Long.parseLong(st.nextToken());
            st.nextToken();
            long expected = Long.parseLong(st.nextToken());
            switch (cal) {
                case "+":
                    if (num1 + num2 == expected)
                        flag = true;
                    break;
                case "-":
                    if (num1 - num2 == expected)
                        flag = true;
                    break;
                case "*":
                    if (num1 * num2 == expected)
                        flag = true;
                    break;
                case "/":
                    if (num1 / num2 == expected)
                        flag = true;
                    break;
            }
            if (flag)
                System.out.println("correct");
            else
                System.out.println("wrong answer");
        }
    }
}
