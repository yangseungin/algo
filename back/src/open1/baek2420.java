package open1;

import java.util.Scanner;

public class baek2420 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n, m;
		n = sc.nextInt();
		m = sc.nextInt();

		if (n - m > 0)
			System.out.println(n - m);
		else
			System.out.println((n - m) * -1);

	}

}
