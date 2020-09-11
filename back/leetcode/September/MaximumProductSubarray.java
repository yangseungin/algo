package September;

public class MaximumProductSubarray {
	public static void main(String[] args) {
		System.out.println(maxProduct(new int[] { 2, 3, -2, 4 }));

	}

	public static int maxProduct(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int now = nums[i];
			int currentMax = max * now;
			int currentMin = min * now;

			max = Math.max(Math.max(currentMax, currentMin), now);
			min = Math.min(Math.min(currentMax, currentMin), now);

			result = Math.max(max, result);
		}

		return result;
	}

}
