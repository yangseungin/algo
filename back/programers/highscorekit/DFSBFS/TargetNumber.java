package highscorekit.DFSBFS;

public class TargetNumber {
	static int ANSWER = 0;

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 1, 1, 1, 1 }, 3));

	}

	public static int solution(int[] numbers, int target) {
		dfs(numbers, target, 0);

		return ANSWER;
	}

	public static void dfs(int[] numbers, int target, int index) {
		if (index == numbers.length) {
			int sum = 0;
			for (int number : numbers) {
				sum += number;
			}
			if (sum == target)
				ANSWER++;

		} else {
			dfs(numbers, target, index + 1);
			numbers[index] *= -1;
			dfs(numbers, target, index + 1);
		}
	}
}
