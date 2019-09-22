package page1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	public static void main(String[] args) {
		System.out.println(subsets(new int[]{1,2,3}));
	}
	
//	Output:
//		[
//		  [3],
//		  [1],
//		  [2],
//		  [1,2,3],
//		  [1,3],
//		  [2,3],
//		  [1,2],
//		  []
//		]
//				

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result =new ArrayList<List<Integer>>();
		System.out.println(Arrays.toString(nums));
		List<Integer> subset = new ArrayList<>();
		
		subsetCount(result, subset, nums, 0);
		
		return result;
		
	}

	public static void subsetCount(List<List<Integer>> result, List<Integer> subset, int[] nums, int index) {
		result.add(new ArrayList<>(subset));

		for (int i = index; i < nums.length; i++) {
			subset.add(nums[i]);
			subsetCount(result, subset, nums, i + 1);
			subset.remove(subset.size() - 1);

		}

	}
}
