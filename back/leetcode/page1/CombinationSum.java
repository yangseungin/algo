package page1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public static void main(String[] args) {
		System.out.println(combinationSum(new int[] { 2, 3, 6, 7 }, 7));

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (candidates == null || candidates.length == 0) {
			return result;
		}
		Arrays.sort(candidates);
		List<Integer> combination = new ArrayList<>();
		combinationList(result, combination, candidates, target, 0);

		return result;
	}

	public static void combinationList(List<List<Integer>> result, List<Integer> combination, int[] candidates,
			int target, int index) {
		if (target == 0) {
			result.add(new ArrayList<>(combination));
			return;
		}

		for (int i = index; i < candidates.length; i++) {
			if (candidates[i] > target) {
				break;
			}
			combination.add(candidates[i]);
			combinationList(result, combination, candidates, target - candidates[i], i);
			combination.remove(combination.size() - 1);

		}

	}

}
