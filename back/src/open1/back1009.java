package open1;

import java.util.Scanner;

public class back1009 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a, b, tmp;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			tmp = 1;
			for (int j = 0; j < b; j++) {
				tmp *= a;
				tmp %= 10;
			}
			if (tmp == 0)
				System.out.println(10);
			else
				System.out.println(tmp);

		}

	}
}
