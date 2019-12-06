package page5;

public class ArithmethicSlices {
	public static void main(String[] args) {
		System.out.println(numberOfArithmeticSlices(new int[] { 1, 2, 3, 4 }));
	}

	public static int numberOfArithmeticSlices(int[] A) {
		int[] dp = new int[A.length];
		int sum = 0;
		for (int i = 2; i < dp.length; i++) {
			if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
				dp[i] = 1 + dp[i - 1];
				sum += dp[i];
			}
		}
		return sum;

	}

}
 