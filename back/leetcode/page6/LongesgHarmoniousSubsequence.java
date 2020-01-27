package page6;

import java.util.HashMap;

public class LongesgHarmoniousSubsequence {
	public static void main(String[] args) {
		System.out.println(findLHS(new int[]{1,3,2,2,5,2,3,7}));

	}

	public static int findLHS(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int res = 0;
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (int key : map.keySet()) {
			if (map.containsKey(key + 1))
				res = Math.max(res, map.get(key) + map.get(key + 1));
		}
		return res;
	}

}
