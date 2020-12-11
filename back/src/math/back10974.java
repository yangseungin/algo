package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back10974 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
            sb.append(arr[i] + " ");
        }
        sb.append("\n");

        while (permutation(arr)) {
            for (int i = 0; i < N; i++)
                sb.append(arr[i] + " ");
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static boolean permutation(int[] arr) {
        int idx = arr.length - 1;
        while (idx > 0 && arr[idx] <= arr[idx - 1])
            idx--;
        if (idx <= 0)
            return false;

        int changeIdx = arr.length - 1;
        while (arr[changeIdx] <= arr[idx - 1])
            changeIdx--;

        int tmp = arr[idx - 1];
        arr[idx - 1] = arr[changeIdx];
        arr[changeIdx] = tmp;
        int start = idx;
        int end = arr.length - 1;
        while (start < end) {
            tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
        return true;
    }
}
