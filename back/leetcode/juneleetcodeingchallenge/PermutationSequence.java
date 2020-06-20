package juneleetcodeingchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSequence {
	public static void main(String[] args) {
		System.out.println(getPermutation(4, 9));

		// 1 2 3 4
		// 1 2 4 3
		// 1 3 2 4
		// 1 3 4 2
		// 1 4 2 3
		// 1 4 3 2

		// 1 1 2 6 24

	}

	public static String getPermutation(int n, int k) {
		List<Integer> list = new ArrayList<>();
		String result = "";
		int fact[] = new int[n];
		fact[0] = 1;
		for (int i = 1; i < n; i++) {
			fact[i] = i * fact[i - 1];
		}

		for (int i = 1; i <= n; i++) {
			list.add(i);
		}

		k--;

		for (int i = n - 1; i >= 0; i--) {
			int ind = k / fact[i];
			result += list.remove(ind);
			k = k % fact[i];
		}
		return result;
	}

}
