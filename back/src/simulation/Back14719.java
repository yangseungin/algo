package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back14719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[] arr = new int[W];
        int[] left = new int[W];
        int[] right = new int[W];
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < W; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
            left[i] = max;
        }
        max = 0;
        for (int i = W - 1; i >= 0; i--) {
            max = Math.max(max, arr[i]);
            right[i] = max;
        }
        int ans = 0;
        for (int i = 0; i < W; i++) {
            int min = Math.min(left[i], right[i]);
            if (min - arr[i] > 0)
                ans += min - arr[i];
        }

        System.out.println(ans);
    }
}
