package day30challenge;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
	public static void main(String[] args) {
		System.out.println(countElements(new int[] { 1, 2, 3 }));
		System.out.println(countElements(new int[] { 1, 1, 3, 3, 5, 5, 7, 7 }));
	}

	public static int countElements(int[] arr) {
		Set<Integer> set = new HashSet<>();
		int count = 0;

		for (int i : arr) {
			set.add(i);
		}

		for (int i : arr) {
			if (set.contains(i + 1)) {
				count++;
			}
		}

		return count;
	}

}
