package page7;

public class FindPivotIndex {
	public static void main(String[] args) {
		System.out.println(pivotIndex(new int[] { 1, 7, 3, 6, 5, 6 }));
	}

	public static int pivotIndex(int[] nums) {
		int sum = 0, leftsum = 0;
		for (int n : nums) {
			sum += n;
		}

		for (int i = 0; i < nums.length; i++) {
			if (leftsum == sum - leftsum - nums[i]) {
				return i;
			}
			leftsum += nums[i];
		}
		return -1;
	}

}
