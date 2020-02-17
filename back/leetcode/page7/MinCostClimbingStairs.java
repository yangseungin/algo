package page7;

public class MinCostClimbingStairs {
	public static void main(String[] args) {

		System.out.println(minCostClimbingStairs(new int[] { 10, 15, 20 }));
	}

	public static int minCostClimbingStairs(int[] cost) {
		int f1 = 0, f2 = 0;
		for (int i = cost.length - 1; i >= 0; --i) {
			int f0 = cost[i] + Math.min(f1, f2);
			f2 = f1;
			f1 = f0;
		}
	
		return Math.min(f1, f2);
	}

}
