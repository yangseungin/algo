package array_vectorsort_stringparsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long l = Long.parseLong(st.nextToken() + st.nextToken());
        long l2 = Long.parseLong(st.nextToken() + st.nextToken());
        System.out.println(l + l2);


    }
}
