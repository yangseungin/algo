package page1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
	public static void main(String[] args) {
		System.out.println(permute(new int[] { 1, 2, 3 }));
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (nums == null || nums.length == 0) {
			return result;
		}
		Arrays.sort(nums);

		List<Integer> combination = new ArrayList<>();

		combine(result, combination, nums);

		return result;

	}

	public static void combine(List<List<Integer>> result, List<Integer> combination, int[] nums) {
		if (nums.length == combination.size()) {
			result.add(new ArrayList<>(combination));
			return ;
		}

		for (int i = 0; i < nums.length; i++) {
			if (combination.contains(nums[i])) {
				continue;
			}
			System.out.println("인덱스: " + i + " / " + nums[i] + " / " + combination.toString());
			combination.add(nums[i]);
			combine(result, combination, nums);
			combination.remove(combination.size() - 1);

		}

	}

}
