package array_vectorsort_stringparsing;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Back10808 {
    public static void main(String[] args) throws IOException {
        int[] alpha = new int[26];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        for (char c : word.toCharArray()) {
            alpha[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alpha.length; i++) {
            sb.append(alpha[i]);
            if (i != 25)
                sb.append(" ");
        }

        System.out.println(sb.toString());

    }
}
