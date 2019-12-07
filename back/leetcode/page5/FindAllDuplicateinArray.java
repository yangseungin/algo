package page5;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateinArray {
	public static void main(String[] args) {
		System.out.println(findDuplicates(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
	}

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();

		for (int c : nums) {
			c = Math.abs(c);
			if (nums[c - 1] > 0)
				nums[c - 1] *= -1;
			else
				list.add(c);
		}
		return list;
	}

}
