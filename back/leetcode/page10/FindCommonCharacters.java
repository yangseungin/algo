package page10;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

	public static void main(String[] args) {
		System.out.println(commonChars(new String[] { "bella", "label", "roller" }));
	}

	public static List<String> commonChars(String[] A) {
		List<String> result = new ArrayList<>();

		for (char c : A[0].toCharArray()) {
			boolean common = true;
			for (int i = 1; i < A.length; i++) {
				if (A[i].indexOf(Character.toString(c)) == -1) {
					common = false;
					break;
				} else {
					A[i] = A[i].replaceFirst(Character.toString(c), "");
				}
			}

			if (common)
				result.add(Character.toString(c));

		}

		return result;
	}
}
