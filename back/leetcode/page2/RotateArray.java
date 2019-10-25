package page2;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		rotate(new int[]{1,2,3,4,5,6,7},3);
	}

	public static void rotate(int[] nums, int k) {
		System.out.println(Arrays.toString(nums));
		
		System.out.println(k%7);
		k%=nums.length;
		
		int[] result = new int[nums.length];
		for(int i=0;i<nums.length;i++){
			result[(k+i)%nums.length]=nums[i];
		}
		for(int i=0;i<nums.length;i++){
			nums[i]=result[i];
		}
		
	}

}
