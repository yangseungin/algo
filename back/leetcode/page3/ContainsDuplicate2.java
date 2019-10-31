package page3;

import java.util.HashMap;

public class ContainsDuplicate2 {
	public static void main(String[] args) {
		System.out.println(containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int curr = nums[i];
			if (hashMap.containsKey(curr) && i - hashMap.get(curr) <= k) {
				return true;
			} else {
				hashMap.put(curr, i);
			}

		}

		return false;
	}
}
