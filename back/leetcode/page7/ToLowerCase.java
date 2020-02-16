package page7;

public class ToLowerCase {
	public static void main(String[] args) {
		System.out.println(toLowerCase("Hello"));
	}

	public static String toLowerCase(String str) {
		char[] tmp = str.toCharArray();
		for (int i = 0; i < tmp.length; i++) {
			if (tmp[i] >= 'A' && tmp[i] <= 'Z') {
				tmp[i] = (char) (tmp[i] + 32);
			}
		}

		return new String(tmp);
	}

}
