package page4;

public class GuessNumberHigherorLower {
	public static void main(String[] args) {
		guessNumber(10);
	}

	/*
	 * The guess API is defined in the parent class GuessGame.
	 * 
	 * @param num, your guess
	 * 
	 * @return -1 if my number is lower, 1 if my number is higher, otherwise
	 * return 0 int guess(int num);
	 */

	public static int guessNumber(int n) {
		int left = 1;
		int right = n;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int result = guess(mid);

			if (result == 0) {
				return mid;
			} else if (result < 0) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return -1;
	}

}
