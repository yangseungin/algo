package day30challenge;

import java.util.HashSet;

public class SingleNumber {
	 public int singleNumber(int[] nums) {
		 HashSet<Integer> hashset = new HashSet<>();
			int result = 0;
			for (int i : nums) {
				if (hashset.contains(i)) {
					hashset.remove(i);
				} else {
					hashset.add(i);
				}
			}

			for (int i : hashset) {
				result = i;
			}
			
			return result;
	    }

}
