package back;

import java.util.Scanner;

public class Back10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		while (true) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			if (num1 == 0 && num2 == 0)
				break;
			else
				System.out.println(num1 + num2);
		}

	}

}
