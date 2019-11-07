package page3;

public class AddDigits {
	public static void main(String[] args) {
		System.out.println(addDigits(383));
	}

	public static int addDigits(int num) {
		if (num < 10) {
			return num;
		} else {
			return addDigits(num / 10 + num % 10);
		}
	}

}
