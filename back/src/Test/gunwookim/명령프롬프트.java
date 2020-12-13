package Test.gunwookim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 명령프롬프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][60];
        char[] result;
        for (int i = 0; i < n; i++)
            arr[i] = br.readLine().toCharArray();

        int length = arr[0].length;
        result = arr[0];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < n; j++) {
                if (result[i] == arr[j][i])
                    continue;
                else
                    result[i] = '?';
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++)
            sb.append(result[i]);

        System.out.println(sb);

    }
}
