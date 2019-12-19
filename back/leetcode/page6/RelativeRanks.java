package page6;

import java.util.Arrays;

public class RelativeRanks {
	public static void main(String[] args) {

		for (String str : findRelativeRanks(new int[] { 5, 4, 3, 2, 1 })) {
			System.out.println(str);
		}
	}

	public static String[] findRelativeRanks(int[] nums) {
		int[] numsOrdered = nums.clone();
		Arrays.sort(numsOrdered);
		int length = nums.length;
		String[] ranking = new String[length];
		for (int i = 0; i < length; i++) {
			int idx = Arrays.binarySearch(numsOrdered, nums[i]);
			if (idx == length - 1) {
				ranking[i] = "Gold Medal";
			} else if (idx == length - 2) {
				ranking[i] = "Silver Medal";
			} else if (idx == length - 3) {
				ranking[i] = "Bronze Medal";
			} else {
				ranking[i] = String.valueOf(length - idx);
			}
		}
		return ranking;
	}

}
