package page7;

public class BinarySearch {
	public static void main(String[] args) {
		System.out.println(search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
	}

	public static int search(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		int pos;
		
		while(left<=right){
			pos= left + (right-left)/2;
			if(nums[pos]==target) return pos;
			if(target<nums[pos]){
				right=pos-1;
			}else{
				left=pos+1;
			}
		}

		return -1;
	}

}
