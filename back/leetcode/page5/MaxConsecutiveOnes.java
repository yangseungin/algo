package page5;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		System.out.println(findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }));

	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int tmp = 0;
		for (int i : nums) {
			if (i == 1) {
				tmp++;
			}
			if (i == 0) {
				max = Math.max(max, tmp);
				tmp = 0;

			}
		}
		max = Math.max(max, tmp);
		return max;
	}

}
