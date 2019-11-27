package page4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class RandomPickIndex {
	static Map<Integer, LinkedList<Integer>> map = new HashMap<>();

	public static void main(String[] args) {
		RandomPickIndex rpi = new RandomPickIndex(new int[] { 1, 2, 3, 3, 3 });
		System.out.println(rpi.pick(3));
	}

	public RandomPickIndex(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				LinkedList<Integer> l = map.get(nums[i]);
				l.add(i);
				map.put(nums[i], l);
			} else {
				LinkedList<Integer> l = new LinkedList<>();
				l.add(i);
				map.put(nums[i], l);
			}
		}
	}

	public static int pick(int target) {
		Random random = new Random();
		LinkedList<Integer> l = map.get(target);
		return l.get(random.nextInt(l.size()));
	}

}
