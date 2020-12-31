package goodbye;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 1;
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st.nextToken());
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[i - 1])
                    continue;
                if (i + 1 >= n || arr[i + 1] >= arr[i] + 1)
                    arr[i]++;
            }
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[i - 1]) {
                    cnt++;
                }
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }
}
