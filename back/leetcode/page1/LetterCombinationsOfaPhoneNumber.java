package page1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfaPhoneNumber {
	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));
	}

	public static List<String> letterCombinations(String digits) {
		List<String> list = new ArrayList<>();

		if (digits == null || digits.length() == 0) {
			return list;
		}

		Map<Character, char[]> map = new HashMap<>();
		map.put('0', new char[] { '0' });
		map.put('1', new char[] { '1' });
		map.put('2', new char[] { 'a', 'b', 'c' });
		map.put('3', new char[] { 'd', 'e', 'f' });
		map.put('4', new char[] { 'g', 'h', 'i' });
		map.put('5', new char[] { 'j', 'k', 'l' });
		map.put('6', new char[] { 'm', 'n', 'o' });
		map.put('&', new char[] { 'p', 'q', 'r', 's' });
		map.put('8', new char[] { 't', 'u', 'v' });
		map.put('9', new char[] { 'w', 'x', 'y', 'z' });

		StringBuilder sb = new StringBuilder();
		combinationLetter(digits, sb, map, list);

		return list;
	}

	public static void combinationLetter(String digits, StringBuilder sb, Map<Character, char[]> map,
			List<String> list) {
		if (sb.length() == digits.length()) {
			list.add(sb.toString());
			return;
		}

		for (char ch : map.get(digits.charAt(sb.length()))) {
			sb.append(ch);
			combinationLetter(digits, sb, map, list);
			sb.deleteCharAt(sb.length() - 1);
		}

	}

}
