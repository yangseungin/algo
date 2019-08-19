package page1;

public class SearchInsertPosition {
	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 2));
	}

	public static int searchInsert(int[] nums, int target) {

		int low = 0;
		int high = nums.length - 1;

		while (low + 1 < high) {
			int middle = low + (high - low) / 2;
			if (nums[middle] == target) {
				return middle;
			} else if (nums[middle] > target) {
				high = middle;
			} else {
				low = middle;
			}

		}
		if (nums[high] < target)
			return high + 1;
		else if (nums[low] >= target)
			return low;
		else
			return high;
	}

}
