package day30challenge;

public class SearchinRotatedSortedArray {
	public static void main(String[] args) {
		System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
	}

	public static int search(int[] nums, int target) {
		int first = 0;
		int last = nums.length - 1;

		while (first <= last) {
			int mid = (first + last) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				if (nums[last] < nums[mid] && target <= nums[last]) {
					first = mid + 1;
				} else {
					last = mid - 1;
				}
			} else {
				if (nums[mid] < nums[first] && target >= nums[first]) {
					last = mid - 1;
				} else {
					first = mid + 1;
				}
			}
		}

		return -1;
	}

}
