package array_vectorsort_stringparsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int[] arr = new int[9];
        int res = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c == '9') {
                arr[c - '0' - 3]++;
                continue;
            }
            arr[c - '0']++;
        }
        if (arr[6] % 2 == 0) {
            arr[6] /= 2;
        } else {
            arr[6] = arr[6] / 2 + 1;
        }
        for (int i : arr) {
            res = Math.max(res, i);
        }
        System.out.println(res);

    }
}
