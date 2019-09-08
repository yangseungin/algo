package page1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {
	public static void main(String[] args) {
		System.out.println(permute(new int[] { 1, 1, 2 }));
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (nums == null || nums.length == 0) {
			return result;
		}
		Arrays.sort(nums);

		List<Integer> combination = new ArrayList<>();
		boolean[] used = new boolean[nums.length];
		combine(result, combination, nums, used);

		return result;

	}

	public static void combine(List<List<Integer>> result, List<Integer> combination, int[] nums, boolean[] used) {
		if (nums.length == combination.size()&&!result.contains(combination)) {
			result.add(new ArrayList<>(combination));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (used[i]) {
				continue;
			}
			used[i] = true;
			System.out.println("인덱스: " + i + " / " + nums[i] + " / " + combination.toString());
			combination.add(nums[i]);
			combine(result, combination, nums, used);
			combination.remove(combination.size() - 1);
			used[i] = false;

		}

	}

}
