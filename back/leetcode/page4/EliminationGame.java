package page4;

public class EliminationGame {
	public static void main(String[] args) {
		System.out.println(lastRemaining(9));
	}

	public static int lastRemaining(int n) {
		if (n == 1) {
			return 1;
		} else if (n % 2 == 1) {
			return lastRemaining(n - 1);
		} else {
			return (n + 2 - 2 * lastRemaining(n / 2));
		}
	}

}
