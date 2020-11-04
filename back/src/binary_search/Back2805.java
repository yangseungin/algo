package binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Back2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int left = 0, mid = 0, right = arr[N - 1];
        long height = 0;

        while (left <= right) {
            height = 0;
            mid = (left + right) / 2;

            for (int i = 0; i < N; i++) {
                if (arr[i] >= mid)
                    height += (arr[i] - mid);
            }
            if (height >= M)
                left = mid + 1;
            else if (height < M)
                right = mid - 1;
        }
        System.out.println(right);
    }
}
