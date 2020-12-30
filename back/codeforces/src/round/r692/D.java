package round.r692;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D {
    static int x, y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '?') {
                getNum(input, i);
            }

        }


        System.out.println(sb);

    }

    private static void getNum(String input, int i) {
        String zeroInput = input.substring(0, i) + "0" + input.substring(i + 1);

        if (zeroInput.contains("?")) {
            for (int idx = i; idx < input.length(); idx++) {
                char c = zeroInput.charAt(idx);
                if (c == '?') {
                    getNum(zeroInput, idx);
                }
            }

        } else {
            System.out.println(zeroInput);
        }

        String oneInput = input.substring(0, i) + "1" + input.substring(i + 1);
        if (oneInput.contains("?")) {
            for (int idx = i; idx < input.length(); idx++) {
                char c = oneInput.charAt(idx);
                if (c == '?') {
                    getNum(oneInput, idx);
                }
            }
        } else {
            System.out.println(oneInput);

        }

    }

}
