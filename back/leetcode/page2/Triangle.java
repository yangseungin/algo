package page2;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);

		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(4);
		List<Integer> list3 = new ArrayList<>();
		list3.add(6);
		list3.add(5);
		list3.add(7);
		List<Integer> list4 = new ArrayList<>();
		list4.add(4);
		list4.add(1);
		list4.add(8);
		list4.add(3);
		triangle.add(list1);
		triangle.add(list2);
		triangle.add(list3);
		triangle.add(list4);

		System.out.println(minimumTotal(triangle));

	}

	public static int minimumTotal(List<List<Integer>> triangle) {
		if (triangle.size() == 0) {
			return 0;
		}
		System.out.println(triangle);

		for (int i = triangle.size() - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				int val = triangle.get(i).get(j);
				int min = Math.min(val + triangle.get(i + 1).get(j), val + triangle.get(i + 1).get(j + 1));
				triangle.get(i).set(j, min);
			}
		}
		System.out.println(triangle);

		return triangle.get(0).get(0);
	}

}
