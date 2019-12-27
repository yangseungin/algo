package page6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumIndexSumTwoList {
	public static void main(String[] args) {
		System.out.println(
				Arrays.toString(findRestaurant(new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" },
						new String[] { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" })));
	}

	public static String[] findRestaurant(String[] list1, String[] list2) {
		List<String> res = new ArrayList<>();
		for (int sum = 0; sum < list1.length + list2.length - 1; sum++) {
			for (int i = 0; i <= sum; i++) {
				if (i < list1.length && sum - i < list2.length && list1[i].equals(list2[sum - i]))
					res.add(list1[i]);
			}
			if (res.size() > 0)
				break;
		}
		return res.toArray(new String[res.size()]);
	}

}
