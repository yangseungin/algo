package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Back2108 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int secondCount = 0;
		int maxNum = -4000, minNum = 4000;
		int[] arr = new int[n];
		int[] count = new int[8001];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			count[arr[i] + 4000]++;
			maxNum = Math.max(maxNum, arr[i]);
			minNum = Math.min(minNum, arr[i]);
		}

		Arrays.sort(arr);

		// 산술평균
		System.out.println((int) Math.round((double) sum / (double) n));

		int midNum = (int) Math.round((double) n / 2);
		// 중앙값
		if (n % 2 == 0) {
			System.out.println(((arr[midNum - 1] + arr[midNum]) / 2) + 1);
		} else
			System.out.println(arr[midNum - 1]);

		int temp = 0;
		for (int i = 0; i <= n - 1; i++) {
			count[arr[i] + 4000]++;
			temp = Math.max(temp, count[arr[i] + 4000]);
		}
		int temp2 = 0;
		for (int i = 0; i < count.length; i++) {

			if (count[i] == temp) {
				secondCount++;
				temp2 = i - 4000;
			}
			if (secondCount == 2) {
				temp2 = i - 4000;
				break;
			}
		}
		// 최빈값
		System.out.println(temp2);

		// 범위
		System.out.println(maxNum - minNum);
	}

}