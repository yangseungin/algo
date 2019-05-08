package open1;

import java.util.Arrays;
import java.util.Scanner;

public class Back1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int[] arrA = new int[n];
		int[] arrB = new int[n];

		for (int i = 0; i < n; i++) {
			arrA[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arrB[i] = sc.nextInt();
		}
		Arrays.sort(arrA);
		Arrays.sort(arrB);

		for (int i = 0; i < n; i++) {
			result += arrA[i] * arrB[n - i - 1];
		}

		System.out.println(result);

	}

}
