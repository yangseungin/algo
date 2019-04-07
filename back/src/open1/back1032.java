package open1;

import java.util.Scanner;

public class back1032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		char[][] arr = new char[n][60];
		char[] result;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine().toCharArray();
		}
		int length = arr[0].length;
		result = arr[0];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < n; j++) {
				if (result[i] == arr[j][i])
					continue;
				else
					result[i] = '?';

			}
			System.out.print("");
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}

	}

}
