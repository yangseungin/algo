package open1;

import java.util.Scanner;

public class back1913 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int where = sc.nextInt();// 찾을 값
		String location = "";// 출력위치
		int value = n * n;
		int row = -1, col = 0;
		int index = 1;// 증감량 1or -1

		int[][] arr = new int[n][n];

		while (n > 0) {
			for (int i = 0; i < n; i++) {
				row += index;
				arr[row][col] = value;
				if (value == where)
					location = (row + 1) + " " + (col + 1);
				value--;
			}
			n--;
			for (int i = 0; i < n; i++) {
				col += index;
				arr[row][col] = value;
				if (value == where)
					location = (row + 1) + " " + (col + 1);
				value--;
			}
			index *= -1;

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(location);

	}

}
