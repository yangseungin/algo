package page1;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray2 {
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] { 1, 1, 1, 2, 2, 3 }));
//		System.out.println(removeDuplicates(new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 }));

	}

	public static int removeDuplicates(int[] nums) {		
		if(nums.length<3){
			return nums.length;
		}
		
		int firstIdx=1;
		int lastIdx=2;
		while(lastIdx<nums.length){
			if(nums[firstIdx]==nums[lastIdx] && nums[firstIdx-1]==nums[lastIdx]){
				lastIdx++;
				
			}else{
				firstIdx++;
				nums[firstIdx]=nums[lastIdx];
				lastIdx++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return firstIdx+1;
	}
}
