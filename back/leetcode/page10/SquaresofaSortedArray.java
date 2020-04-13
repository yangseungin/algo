package page10;

import java.util.Arrays;

public class SquaresofaSortedArray {
	public static void main(String[] args) {
		for (int i : sortedSquares(new int[] { -4, -1, 0, 3, 10 })) {
			System.out.println(i);
		}
	}

	public static int[] sortedSquares(int[] A) {
		//runtime :7ms
		return Arrays.stream(A).map(n -> n * n).sorted().toArray();
	}
	
	public static int[] sortedSquares2(int[] A) {
		//runtime : 2ms
		int N = A.length;
        int[] ans = new int[N];
        for (int i = 0; i < N; ++i)
            ans[i] = A[i] * A[i];

		Arrays.sort(ans);
        return ans;

	}

}
