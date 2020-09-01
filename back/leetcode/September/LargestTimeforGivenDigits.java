package September;

public class LargestTimeforGivenDigits {
	public static void main(String[] args) {
		System.out.println(largestTimeFromDigits(new int[] { 1, 2, 3, 4 }));
	}
	public static String largestTimeFromDigits(int[] A) {
		int[] map = new int[10];
		for (int a : A) {
			map[a]++;
		}

		for (int i = 2359; i >= 0; i--) {
			if (timeCheck(i) && check(i, map)) {
				String tmp = String.valueOf(i);
				while (tmp.length() < 4) {
					tmp = "0" + tmp;
				}
				return tmp.substring(0, 2) + ":" + tmp.substring(2, 4);
			}
		}
		return "";
	}

	static boolean check(int time, int[] map) {
		int[] newVal = new int[10];
		for (int i = 0; i < 4; i++) {
			newVal[time % 10]++;
			time /= 10;
		}
		for (int i = 0; i < 10; i++) {
			if (newVal[i] != map[i]) {
				return false;
			}
		}
		return true;
	}

	static boolean timeCheck(int time) {
		int minute = time % 100;
		time = time / 100;
		int hour = time % 100;
		return minute < 60 && hour < 24;
	}

}
