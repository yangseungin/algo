package page8;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

	public List<String> letterCasePermutation(String S) {
		char[] arr = S.toCharArray();
		List<String> result = new ArrayList<>();
		findCase(arr, result, 0);
		return result;
	}

	public void findCase(char[] arr, List<String> result, int idx) {
		if (idx == arr.length) {
			result.add(new String(arr));
		} else {
			char tmp = arr[idx];
			if (isAlpha(tmp)) {
				arr[idx] = Character.toLowerCase(tmp);
				findCase(arr, result, idx + 1);
				arr[idx] = Character.toUpperCase(tmp);
				findCase(arr, result, idx + 1);
			} else {
				findCase(arr, result, idx + 1);
			}
		}

	}

	public boolean isAlpha(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}

}
