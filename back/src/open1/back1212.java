package open1;

import java.util.Scanner;

public class back1212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {			
			System.out.print(transform(str.charAt(i), i));
		}

	}

	public static String transform(char str, int i) {
		String tmp = "";
		switch (str) {
		case '0':
			if (i == 0)
			tmp = "0";
		else
			tmp = "000";
			break;
		case '1':
			if (i == 0)
				tmp = "1";
			else
				tmp = "001";
			break;
		case '2':
			if (i == 0)
				tmp = "10";
			else
				tmp = "010";
			break;
		case '3':
			if (i == 0)
				tmp = "11";
			else
				tmp = "011";
			break;
		case '4':
			tmp = "100";
			break;
		case '5':
			tmp = "101";
			break;
		case '6':
			tmp = "110";
			break;
		case '7':
			tmp = "111";
			break;
		}

		return tmp;
	}

}
