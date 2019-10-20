package page2;

public class ExcelSheetColumnNumber {
	public static void main(String[] args) {
		System.out.println(titleToNumber("AB"));
		System.out.println("===");
		System.out.println(titleToNumber("ZY"));

	}

	public static int titleToNumber(String s) {
		int result = 0;

		for (char c : s.toCharArray()) {
			result = 26 * result + (int) c - 64;
		}

		return result;
	}

}
