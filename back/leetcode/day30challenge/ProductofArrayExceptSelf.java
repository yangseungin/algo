package day30challenge;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
	}

	public static int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		int[] arr1 = new int[nums.length];
		int[] arr2 = new int[nums.length];

		arr1[0] = 1;
		arr2[nums.length - 1] = 1;

		for (int i = 0; i < nums.length - 1; i++) {
			arr1[i + 1] = nums[i] * arr1[i];
		}

		for (int i = nums.length - 1; i > 0; i--) {
			arr2[i - 1] = arr2[i] * nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			result[i] = arr1[i] * arr2[i];
		}

		return result;
	}

}
