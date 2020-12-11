package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class back10819 {
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        while (permutation(arr)) {
            max = Math.max(max, getSum(arr));
        }
        System.out.println(max);
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

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++)
            sum += Math.abs(arr[i] - arr[i + 1]);
        return sum;
    }
}
