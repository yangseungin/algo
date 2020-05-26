package mayleetcodingchallenge;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
	public static void main(String[] args) {
		System.out.println(findMaxLength(new int[] { 0, 1 }));
	}

	public static int findMaxLength(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int maxLen = 0, count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count += -1;
			} else {
				count += 1;
			}

			if (map.containsKey(count)) {
				maxLen = Math.max(maxLen, i - map.get(count));
			} else {
				map.put(count, i);
			}

		}

		return maxLen;
	}

}
