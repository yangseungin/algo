package page6;

public class Base7 {
	public static void main(String[] args) {
		System.out.println(convertToBase7(100));
	}

	public static String convertToBase7(int num) {
		if (num == 0) {
			return "0";
		}
		String str = "";
		int temp = Math.abs(num);
		while (temp > 0) {

			str = temp % 7 + str;
			temp = temp / 7;
		}
		if (num < 0)
			str = "-" + str;

		return str;

	}

}
