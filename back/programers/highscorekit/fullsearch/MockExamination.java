package highscorekit.fullsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockExamination {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 4, 5 })));
		System.out.println(Arrays.toString(solution(new int[] { 1, 3, 2, 4, 2 })));

	}

	public static int[] solution(int[] answers) {
		List<Integer> list = new ArrayList<Integer>();
		int[] temp = { 0, 0, 0 };
		int[] player1 = { 1, 2, 3, 4, 5 }; // length = 5;
		int[] player2 = { 2, 1, 2, 3, 2, 4, 2, 5 }; // length = 8;
		int[] player3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }; // length = 100;

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == player1[i % 5])
				temp[0]++;
			if (answers[i] == player2[i % 8])
				temp[1]++;
			if (answers[i] == player3[i % 10])
				temp[2]++;
		}

		int maxNum = 0;
		 for (int i=0;i<temp.length;i++) {
	            if (temp[i] > maxNum) {
	                maxNum = temp[i];
	            }
	        }
		 
		for (int i = 0; i < 3; i++) {
			if (maxNum <= temp[i]) {
				list.add(i + 1);
			}
		}
		int[] answer = list.stream().mapToInt(i -> i).toArray();
		// list -> array java8에서 추가된 스트림
		// https://stackoverflow.com/questions/960431/how-to-convert-listinteger-to-int-in-java

		return answer;
	}

}
