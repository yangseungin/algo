package page7;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
	public static void main(String[] args) {

		List<Integer> result = selfDividingNumbers(1, 22);
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) +" ");
		}
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			
			if (dividing(i)) {
				result.add(i);
			}
		}

		return result;
	}

	public static boolean dividing(int n) {
		for (char c : String.valueOf(n).toCharArray()) {
			if (c == '0' || (n % (c - '0') != 0))
				return false;
		}
		return true;
	}

}
