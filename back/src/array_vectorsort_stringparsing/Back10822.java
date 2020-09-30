package array_vectorsort_stringparsing;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class Back10822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        while (st.hasMoreTokens()) {
            res += Integer.parseInt(st.nextToken());
        }
        System.out.println(res);
    }
}
