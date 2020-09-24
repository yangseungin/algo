package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        String[] sentences = new String[count];

        for (int i = 0; i < count; i++) {
            StringBuilder sb = new StringBuilder();
            sentences[i] = br.readLine();
            String[] ori = sentences[i].split(" ");

            for (String str : ori) {
                for (int j = str.length() - 1; j >= 0; j--) {
                    sb.append(str.charAt(j));
                }
                sb.append(" ");

            }
            System.out.println(sb.toString());
        }


    }
}
