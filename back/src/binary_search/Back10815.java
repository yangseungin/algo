package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            int left = 0, right = N - 1;
            int tmp = 0;
            while (left <= right) {
                int midIdx = (left + right) / 2;
                int mid = arr[midIdx];
                if (num < mid) {
                    right = midIdx - 1;
                    tmp = 0;
                } else if (num > mid) {
                    left = midIdx + 1;
                    tmp = 0;
                } else {
                    tmp = 1;
                    break;
                }
            }
            sb.append(tmp + " ");
        }
        System.out.println(sb);
    }
}
