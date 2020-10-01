package array_vectorsort_stringparsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10823 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        StringBuilder sb = new StringBuilder();
        int res = 0;
        while ((str = br.readLine()) != null) {
            sb.append(str);
        }
        StringTokenizer st = new StringTokenizer(sb.toString(), ",");

        while (st.hasMoreTokens()) {
            res += Integer.parseInt(st.nextToken());
        }
        System.out.println(res);

    }
}
