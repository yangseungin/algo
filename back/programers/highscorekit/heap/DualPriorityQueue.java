package highscorekit.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DualPriorityQueue {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "I 7", "I 5", "I -5", "D -1" })));

	}

	public static int[] solution(String[] operations) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < operations.length; i++) {
			String[] tmp = operations[i].split(" ");

			if (tmp[0].equals("I")) {
				list.add(Integer.parseInt(tmp[1]));
				Collections.sort(list);
			} else if (tmp[0].equals("D") && list.size() > 0) {
				if (tmp[1].equals("1"))
					list.remove(list.size() - 1);
				else if (tmp[1].equals("-1"))
					list.remove(0);

			}

		}
		if (list.size() == 0)
			return new int[] { 0, 0 };
		else {
			return new int[] { list.get(list.size() - 1), list.get(0) };
		}

	}

}
