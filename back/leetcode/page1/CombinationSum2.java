package page1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
	public static void main(String[] args) {
		System.out.println(combinationSum2(new int[] { 10,1,2,7,6,1,5 }, 8));
	}
	
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
			if(i!=index&&candidates[i]==candidates[i-1]){
				continue;
			}
			
			if (candidates[i] > target) {
				break;
			}
			combination.add(candidates[i]);
			combinationList(result, combination, candidates, target - candidates[i], i+1);
			combination.remove(combination.size() - 1);

		}

	}

}
