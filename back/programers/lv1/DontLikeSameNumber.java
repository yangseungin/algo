package lv1;

import java.util.ArrayList;

public class DontLikeSameNumber {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 1, 3, 3, 0, 1, 1 }));
		System.out.println(solution(new int[] { 4, 4, 4, 3, 3, }));
	}

	public static int[] solution(int[] arr) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(arr[0]);
		int idx = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != list.get(idx)) {
				list.add(arr[i]);
				idx++;
			}

		}

		// System.out.println(list.toString());
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

}
