package page10;

public class DivisorGame {
	public static void main(String[] args) {
		System.out.println(divisorGame(2));
	}

	public static boolean divisorGame(int N) {
		boolean[] moves = new boolean[N + 1];
		moves[1] = false;
		for (int i = 1; i <= N; i++) {
			moves[i] = false;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					if (!moves[i - j]) {
						moves[i] = true;
						break;
					}
				}
			}

		}

		return moves[N];
	}

}
