package page7;

public class LargestNumberatLeastTwiceofOthers {
	public static void main(String[] args) {

		System.out.println(dominantIndex(new int[] { 3, 6, 1, 0 }));
	}

	public static int dominantIndex(int[] nums) {
		int maxIdx = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > nums[maxIdx]) {
				maxIdx = i;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(maxIdx !=i && nums[maxIdx]<nums[i]*2){
				return -1;
			}
		}

		return maxIdx;
	}

}
