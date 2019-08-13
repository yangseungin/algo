package page1;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome(11));
		System.out.println(isPalindrome2(11));

	}

	public static boolean isPalindrome(int x) {
		String numStr = String.valueOf(x);
		Boolean result = true;
		// 음수 false
		if (x < 0) {
			return false;
		}

		for (int i = 0; i < numStr.length() / 2; i++) {
			if (numStr.charAt(i) != numStr.charAt(numStr.length() - 1 - i))
				return false;
		}

		return result;
	}
	// String 변환 없이 풀
	public static boolean isPalindrome2(int x) {
		Boolean result = true;
		long tmp = 0;
		int firstNum = x;
		// 음수 false
		if (x < 0) {
			return false;
		}

		while (x > 0) {
			tmp = tmp * 10 + x % 10;
			x /= 10;
			if (tmp > Integer.MAX_VALUE || tmp < Integer.MIN_VALUE)
				tmp = 0;

		}
		System.out.println(tmp + " / " + firstNum);
		if (firstNum != tmp) {
			return false;
		}

		return result;
	}

}
