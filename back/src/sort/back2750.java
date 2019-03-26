package sort;

import java.util.Scanner;

public class back2750 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] arr = new int[count];
		// 삽입정렬

		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < count; i++) {
			int temp = arr[i];
			int num = i - 1;
			while ((num >= 0) && (arr[num] > temp)) {
				arr[num + 1] = arr[num];
				num--;
			}
			arr[num + 1] = temp;
		}

		for (int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}

	}

}
