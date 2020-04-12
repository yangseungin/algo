package day30challenge;

import java.util.PriorityQueue;

public class LastStoneWeight {
	public static void main(String[] args) {
		System.out.println(lastStoneWeight(new int[] { 2, 7, 4, 1, 8, 1 }));
	}

	public static int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> que = new PriorityQueue<>();

		for (int stone : stones) {
			que.add(-stone);
		}

		while (que.size() > 1) {
			int stone1 = -que.remove();
			int stone2 = -que.remove();
			if (stone1 != stone2) {
				que.add(-(stone1 - stone2));
			}
		}

		return que.isEmpty() ? 0 : -que.remove();
	}

}
