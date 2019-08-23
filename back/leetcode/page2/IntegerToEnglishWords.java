package page2;

import java.util.HashMap;

public class IntegerToEnglishWords {
	static HashMap<Integer, String> hashMap = new HashMap<>();

	public static void main(String[] args) {
		System.out.println(numberToWords(1234567));
		System.out.println(numberToWords(1000));
	}

	public static String numberToWords(int num) {
		hashMap.put(0, "Zero");
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(3, "Three");
		hashMap.put(4, "Four");
		hashMap.put(5, "Five");
		hashMap.put(6, "Six");
		hashMap.put(7, "Seven");
		hashMap.put(8, "Eight");
		hashMap.put(9, "Nine");
		hashMap.put(10, "Ten");
		hashMap.put(11, "Eleven");
		hashMap.put(12, "Twelve");
		hashMap.put(13, "Thirteen");
		hashMap.put(14, "Fourteen");
		hashMap.put(15, "Fifteen");
		hashMap.put(16, "Sixteen");
		hashMap.put(17, "Seventeen");
		hashMap.put(18, "Eighteen");
		hashMap.put(19, "Nineteen");
		hashMap.put(20, "Twenty");
		hashMap.put(30, "Thirty");
		hashMap.put(40, "Forty");
		hashMap.put(50, "Fifty");
		hashMap.put(60, "Sixty");
		hashMap.put(70, "Seventy");
		hashMap.put(80, "Eighty");
		hashMap.put(90, "Ninety");
		hashMap.put(100, "Hundred");
		hashMap.put(1000, "Thousand");
		hashMap.put(1000000, "Million");
		hashMap.put(1000000000, "Billion");

		StringBuilder sb = new StringBuilder();
		final int billion = 1000000000;
		final int million = 1000000;
		final int thousand = 1000;
		
		if (num == 0) {
			return hashMap.get(num);
		}
		if (num >= billion) {
			int digit = num / billion;
			sb.append(convert(digit) + " " + hashMap.get(billion));
			num %= billion;
		}
		if (num >= million) {
			int digit = num / million;
			sb.append(convert(digit) + " " + hashMap.get(million));
			num %= million;
		}
		if (num >= thousand) {
			int digit = num / thousand;
			sb.append(convert(digit) + " " + hashMap.get(thousand));
			num %= thousand;
		}
		if (num > 0) {
			sb.append(convert(num));
		}

		return sb.toString().trim();
	}

	public static String convert(int num) {
		StringBuilder sb = new StringBuilder();

		if (num >= 100) {
			int digit = num / 100;
			sb.append(" " + hashMap.get(digit) + " " + hashMap.get(100));
			num %= 100;
		}
		if (num > 0) {
			if(num <= 20){
				sb.append(" " + hashMap.get(num));
			}else {
				int digit = num / 10;
				sb.append(" " + hashMap.get(digit * 10));

				if (num % 10 > 0) {
					sb.append(" " + hashMap.get(num % 10));
				}
			}			
		}
		return sb.toString();
	}

}
