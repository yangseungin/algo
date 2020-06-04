package juneleetcodeingchallenge;

import java.util.Arrays;

public class TwoCityScheduling {
	public static void main(String[] args) {
		System.out.println(twoCitySchedCost(new int[][] { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } }));
	}

	public static int twoCitySchedCost(int[][] costs) {
		int N = costs.length / 2;
		int[] refund = new int[costs.length];
		int minCost = 0, index = 0;
		System.out.println(Arrays.toString(refund));
		for (int[] cost : costs) {
			refund[index++] = cost[1] - cost[0];
			minCost += cost[0];
		}
		System.out.println(Arrays.toString(refund));
		System.out.println(minCost);
		Arrays.sort(refund);
		System.out.println(Arrays.toString(refund));
		for (int i = 0; i < costs.length/2; i++) {
			minCost += refund[i];
		}
		return minCost;

	}

}
