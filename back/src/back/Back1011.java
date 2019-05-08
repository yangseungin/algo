package back;

import java.util.Scanner;

public class Back1011 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {
			int minN, powN, maxN, warpCount = 0;
			int num = 0;

			int numX = sc.nextInt();
			int numY = sc.nextInt();
			int cha = numY - numX;

			num++;
			while (true) {
				powN = num * num;
				minN = powN = num + 1;
				maxN = powN + 1 + num - 1;

				if (minN <= cha && cha <= maxN) {
					if (minN <= cha && cha <= powN)
						warpCount = (num << 1) - 1;
					else
						warpCount = num << 1;
					break;
				}

				num++;
			}

			System.out.println(warpCount);
		}

	}

}
