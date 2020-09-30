package array_vectorsort_stringparsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back4458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb;
        for (int i = 0; i < N; i++) {
            sb = new StringBuilder();
            String str = br.readLine();

            if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
                sb.append((char) (str.charAt(0) - 32));
            } else {
                sb.append(str.charAt(0));
            }
            sb.append(str.substring(1));
            System.out.println(sb.toString());
        }


    }
}
