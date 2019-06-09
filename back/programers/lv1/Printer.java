package lv1;

import java.util.ArrayList;
import java.util.List;

public class Printer {
	public static void main(String[] args) {
		// System.out.println(solution(new int[] { 2, 1, 3, 2 }, 2));
		System.out.println(solution(new int[] { 1, 1, 9, 1, 1, 1 }, 0));
	}

	public static class Document {
		int priority;
		boolean target;

		public Document(int priority, boolean target) {
			this.priority = priority;
			this.target = target;
		}

	}

	public static int solution(int[] priorities, int location) {
		int answer = 0;

		List<Document> list = new ArrayList<>();
		for (int i = 0; i < priorities.length; i++) {
			if (i == location)
				list.add(new Document(priorities[i], true));
			else
				list.add(new Document(priorities[i], false));
		}

		int index = 0;
		while (index < list.size()) {
			boolean flag = false;
			for (int i = index + 1; i < list.size(); i++) {
				if (list.get(index).priority < list.get(i).priority) {
					flag = true;
					list.add(list.get(index));
					list.remove(index);

				}
			}
			if (flag == false)
				index++;
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).target == true)
				answer = i + 1;
		}

		return answer;
	}
}
