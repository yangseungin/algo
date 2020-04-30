package day30challenge;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstUniqueNumber {
	Set<Integer> unique = new LinkedHashSet<>();
	Set<Integer> all = new HashSet<>();

	public FirstUniqueNumber(int[] nums) {
		for (int num : nums) {
			add(num);
		}
	}

	public int showFirstUnique() {
		if (unique.isEmpty()) {
			return -1;
		}
		return unique.iterator().next();
	}

	public void add(int value) {
		if (all.add(value)) {
			unique.add(value);
		} else {
			unique.remove(value);
		}

	}

}
