package page5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement1 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(nextGreaterElement(new int[] { 4, 1, 2 }, new int[] { 1, 3, 4, 2 })));
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>(); 
		int[] result = new int[nums1.length];
		Arrays.fill(result,-1);
		for (int i = 0; i < nums2.length; i++) { // O(m)
			map.put(nums2[i], i);
		}
		for (int i = 0; i < nums1.length; i++) { // O(mn)
			int start = map.get(nums1[i]);
			while (start < nums2.length) {
				if (nums1[i] < nums2[start]) {
					result[i] = nums2[start];
					break;
				}
				start++;
			}
		}
		return result;
	}

}
