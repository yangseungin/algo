package Test.gunwookim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int T = Integer.parseInt(br.readLine());
        int[] sumArr = new int[T];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                    sumArr[i] = sumArr[i] + count;
                } else {
                    count = 0;
                }
            }
        }

        for (int i = 0; i < T; i++)
            sb.append(sumArr[i]+"\n");
        System.out.println(sb);
    }
}
