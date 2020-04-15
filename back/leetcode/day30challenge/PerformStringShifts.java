package day30challenge;

public class PerformStringShifts {
	public static void main(String[] args) {
		// System.out.println(stringShift("abc", new int[][] { { 0, 3 }, { 1, 2
		// } }));
		// System.out.println(stringShift("yisxjwry",
		// new int[][] { { 1, 8 }, { 1, 4 }, { 1, 3 }, { 1, 6 }, { 0, 6 }, { 1,
		// 4 }, { 0, 2 }, { 0, 1 } }));
		System.out.println(stringShift("xqgwkiqpif", new int[][] { { 1, 4 }, { 0, 7 }, { 0, 8 }, { 0, 7 }, { 0, 6 },
				{ 1, 3 }, { 0, 1 }, { 1, 7 }, { 0, 5 }, { 0, 6 } }));

	}

	public static String stringShift(String s, int[][] shift) {

		int val = 0;
		int len = s.length();
		String result = "";
		for (int i = 0; i < shift.length; i++) {
			val += shift[i][0] == 0 ? -shift[i][1] : shift[i][1];
		}

		if (Math.abs(val) >= len) {
			val %= len;
		}

		if (val > 0) {
			// right
			result = s.substring(len - val, len) + s.substring(0, len - val);
		} else {
			// left
			result = s.substring(-val, len) + s.substring(0, -val);

		}

		return result;
	}
}
