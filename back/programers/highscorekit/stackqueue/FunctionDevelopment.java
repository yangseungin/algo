package highscorekit.stackqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionDevelopment {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 93, 30, 55 }, new int[] { 1, 30, 5 }));
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> que = new LinkedList<Integer>();

		for (int i = 0; i < progresses.length; i++) {
			if ((100 - progresses[i]) % speeds[i] == 0)
				que.offer((100 - progresses[i]) / speeds[i]);
			else
				que.offer((100 - progresses[i]) / speeds[i] + 1);
		}

		List<Integer> list = new ArrayList<Integer>();
		int first = que.poll();
		int count = 1;
		while (!que.isEmpty()) {
			int later = que.poll();
			if (first >= later) {
				count++;
			} else {
				list.add(count);
				count = 1;
				first = later;
			}
		}
		list.add(count);

		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

}
