package juneleetcodeingchallenge;

import java.util.ArrayList;
import java.util.Random;

public class RandomPickwithWeight {
	private ArrayList<Integer> nums;
	private Random rand;

	public RandomPickwithWeight(int[] w) {
	        this.nums = new ArrayList<>();
	        this.rand = new Random();
	        
	        for (int i = 0; i < w.length; i++)
	            for (int j = 0; j < w[i]; j++)
	                this.nums.add(i);
	    }

	public int pickIndex() {
		int n = this.rand.nextInt(nums.size());
		return nums.get(n);
	}
}
