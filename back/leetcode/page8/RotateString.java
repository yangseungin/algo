package page8;

public class RotateString {
	public static void main(String[] args) {
		System.out.println(rotateString("abcde", "cdeab"));
	}

	public static boolean rotateString(String A, String B) {
		if (A == null && B == null)
			return true;

		if (A == null || B == null)
			return false;

		if (A.length() != B.length())
			return false;

		return (A+A).indexOf(B) >= 0;
	}

}
