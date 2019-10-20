package page2;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] { 6,5,5 }));
	}

	public static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = 0;
		int result=0;

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
			if (max < map.get(nums[i])) {
				max = map.get(nums[i]);
				result=nums[i];
			}
		}
		System.out.println(map);
		System.out.println(max);
		System.out.println(result);
		
		
		return result;
	}

}
