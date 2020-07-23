package julyleetcodingchallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber3 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(singleNumber(new int[] { 1, 2, 1, 3, 2, 5 })));

	}

	public static int[] singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		int[] res = new int[2];

		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		int idx = 0;
		for (Integer key : map.keySet()) {
			if (map.get(key) != 2) {
				res[idx] = key;
				idx++;
			}
		}

		return res;
	}

}
