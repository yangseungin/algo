package day30challenge;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
		moveZeroes(new int[]{0,1,0,3,12});
	}
	public static void moveZeroes(int[] nums){
		int j = 0;
		int i = 0;

		while (j < nums.length && i <= j) {
			if (nums[i] == 0) {
				while (j < nums.length && nums[j] == 0)
					j++;
			}

			if (j < nums.length) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}

			i++;
			j++;

		}

		System.out.println(Arrays.toString(nums));
	}
}
