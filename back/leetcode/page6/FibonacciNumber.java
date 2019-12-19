package page6;

public class FibonacciNumber {
	public static void main(String[] args) {
		System.out.println(fib(3));
	}

	public static int fib(int N) {
		if (N <= 1) {
			return N;
		}
		int[] dp = new int[N + 1];
		dp[1] = 1;

		for (int i = 2; i <= N; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[N];
	}

	

}
