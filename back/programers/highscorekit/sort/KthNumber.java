package highscorekit.sort;

import java.util.Arrays;

public class KthNumber {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 5, 2, 6, 3, 7, 4 }, new int[][] { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } })));
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] temp = new int[commands[i][1] - commands[i][0] + 1];
			int idx = 0;
			for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
				temp[idx] = array[j];
				idx++;
			}
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}

		return answer;
	}

}
