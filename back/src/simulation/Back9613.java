package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st.nextToken());

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++)
                    sum += getGcd(arr[i], arr[j]);
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }

    public static long getGcd(int x, int y) {
        while (y > 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }

}
