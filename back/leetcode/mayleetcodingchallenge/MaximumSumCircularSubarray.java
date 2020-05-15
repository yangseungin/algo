package mayleetcodingchallenge;

public class MaximumSumCircularSubarray {
	public static void main(String[] args) {
		System.out.println(maxSubarraySumCircular(new int[] { 1, -2, 3, -2 }));
	}

	public static int maxSubarraySumCircular(int[] A) {
		int len = A.length;

		int ans = A[0], cur = A[0];
		for (int i = 1; i < len; ++i) {
			cur = A[i] + Math.max(cur, 0);
			ans = Math.max(ans, cur);
		}

		int[] rightsums = new int[len];
		rightsums[len - 1] = A[len - 1];
		for (int i = len - 2; i >= 0; --i)
			rightsums[i] = rightsums[i + 1] + A[i];

		int[] maxright = new int[len];
		maxright[len - 1] = A[len - 1];
		for (int i = len - 2; i >= 0; --i)
			maxright[i] = Math.max(maxright[i + 1], rightsums[i]);

		int leftsum = 0;
		for (int i = 0; i < len - 2; ++i) {
			leftsum += A[i];
			ans = Math.max(ans, leftsum + maxright[i + 2]);
		}

		return ans;
	}
}
