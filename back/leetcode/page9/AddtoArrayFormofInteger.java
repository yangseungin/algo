package page9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger {
	public static void main(String[] args) {
		System.out.println(addToArrayForm(new int[] { 1, 2, 0, 0 }, 34));
	}

	public static List<Integer> addToArrayForm(int[] A, int K) {
		int N = A.length - 1;
		int cur = K;
		List<Integer> ans = new ArrayList<>();

		int i = N;
		while (i >= 0 || cur > 0) {
			if (i >= 0)
				cur += A[i];
			ans.add(cur % 10);
			cur /= 10;
			i--;
		}

		Collections.reverse(ans);
		return ans;
	}

}
