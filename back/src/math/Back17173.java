package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back17173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] arr = br.readLine().split(" ");

        int sum = 0;
        for (int i = Integer.parseInt(arr[0]); i <= N; i++) {
            for (int j = 0; j < M; j++) {
                if (i % Integer.parseInt(arr[j]) == 0) {
                    sum += i;
                    break;
                }
            }
        }
        System.out.println(sum);


    }
}
