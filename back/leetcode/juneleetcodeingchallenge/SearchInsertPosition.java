package juneleetcodeingchallenge;

public class SearchInsertPosition {
	public static void main(String[] args) {
		System.out.println(searchInsert(new int[]{ 1, 3, 5, 6 }, 5));
	}

	public static int searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left + 1 < right) {
			int middle = left + (right - left) / 2;
			if (nums[middle] == target) {
				return middle;
			} else if (nums[middle] > target) {
				right = middle;
			} else {
				left = middle;
			}

		}
		if (nums[right] < target)
			return right + 1;
		else if (nums[left] >= target)
			return left;
		else
			return right;
	}

}
