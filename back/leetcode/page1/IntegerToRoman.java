package page1;

import java.util.HashMap;

public class IntegerToRoman {
	public static void main(String[] args) {
		System.out.println(intToRoman(1994));

	}

	public static String intToRoman(int num) {
		HashMap<Integer, Character> hashMap = new HashMap<>();
		hashMap.put(1, 'I');
		hashMap.put(5, 'V');
		hashMap.put(10, 'X');
		hashMap.put(50, 'L');
		hashMap.put(100, 'C');
		hashMap.put(500, 'D');
		hashMap.put(1000, 'M');

		int numSize = (int) (Math.log10(num) + 1);
		String result = "";
		
		for (int i = 0; i < numSize; i++) {
			int num10 = (int) Math.pow(10, numSize - 1 - i);
			int digitNum = num / num10;

			if (digitNum == 4) {
				result += hashMap.get(num10);
				result += hashMap.get(num10 * 5);

			} else if (digitNum == 9) {
				result += hashMap.get(num10);
				result += hashMap.get(num10 * 10);

			} else {
				if (digitNum > 4) {
					result += hashMap.get(num10 * 5);
				}
				for (int j = 0; j < digitNum%5; j++) {
					result += hashMap.get(num10);
				}

			}

			num -=digitNum*num10;
		}

		return result;
	}

}
