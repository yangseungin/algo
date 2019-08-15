package page1;

import java.util.HashMap;

public class RomanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
	}

	public static int romanToInt(String s) {
		/*
			hashmap에 각 문자가 의미하는값을 넣어놓고
			입력받은 값을 뒤에서부터 차례대로 읽어가며 더한다
			뒤에숫자가 더큰경우 다음값을 더하지않고 뺴주면된다.
		*/
		
		HashMap<Character, Integer> hashMap = new HashMap<>();
		hashMap.put('I', 1);
		hashMap.put('V', 5);
		hashMap.put('X', 10);
		hashMap.put('L', 50);
		hashMap.put('C', 100);
		hashMap.put('D', 500);
		hashMap.put('M', 1000);

		int sumNum = 0;
		sumNum = hashMap.get(s.charAt(s.length() - 1));
		for (int i = 0; i < s.length() - 1; i++) {
			if (hashMap.get(s.charAt(s.length() - 1 - i)) > hashMap.get(s.charAt(s.length() - 1 - i - 1))) {
				sumNum -= hashMap.get(s.charAt(s.length() - 1 - i - 1));
			} else {
				sumNum += hashMap.get(s.charAt(s.length() - 1 - i - 1));
			}

		}

		return sumNum;
	}
}
