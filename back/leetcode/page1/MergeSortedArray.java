package page1;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String[] args) {
		merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		while (m > 0 && n > 0) {
			if (nums1[m - 1] > nums2[n - 1]) {
				nums1[m + n - 1] = nums1[m - 1];
				m--;
			} else {
				nums1[m + n - 1] = nums2[n - 1];
				n--;
			}
		}

		while (n > 0) {
			nums1[m + n - 1] = nums2[n - 1];
			n--;
		}

		System.out.println(Arrays.toString(nums1));

	}

}
