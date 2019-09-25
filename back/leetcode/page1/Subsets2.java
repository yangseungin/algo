package page1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
	public static void main(String[] args) {
		System.out.println(subsetsWithDup(new int[] { 4,4,4,1,4 }));
	}

	// Output:
	// [
	// [3],
	// [1],
	// [2],
	// [1,2,3],
	// [1,3],
	// [2,3],
	// [1,2],
	// []
	// ]
	//

	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> subset = new ArrayList<>();
		Arrays.sort(nums);
		
		subsetCount(result, subset, nums, 0);

		return result;

	}

	public static void subsetCount(List<List<Integer>> result, List<Integer> subset, int[] nums, int index) {
		
		if (!result.contains(subset)) {
			result.add(new ArrayList<>(subset));
		}
		
		for (int i = index; i < nums.length; i++) {
			subset.add(nums[i]);
			subsetCount(result, subset, nums, i + 1);
			subset.remove(subset.size() - 1);

		}

	}
}
