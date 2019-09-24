package page1;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public static void main(String[] args) {
		System.out.println(grayCode(3));
	}

	public static List<Integer> grayCode(int n) {
		List<Integer> result = new ArrayList<>();
		result.add(0);
		for (int i = 1; i <= n; i++) {
			int index = (int) Math.pow(2, i - 1) - 1;
			for (int j = index; j >= 0; j--) {
				result.add((int) (Math.pow(2, i - 1)) + result.get(index--));
			}
		}
		return result;

	}
}
