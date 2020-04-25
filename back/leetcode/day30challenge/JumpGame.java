package day30challenge;

public class JumpGame {
	public static void main(String[] args) {
		System.out.println(canJump(new int[] { 2, 3, 1, 1, 4 }));
		System.out.println(canJump(new int[] { 3, 2, 1, 0, 4 }));

	}

	public static boolean canJump(int[] nums) {
		int pos = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (i + nums[i] >= pos) {
				pos = i;
			}
		}

		return pos == 0;
	}

}
