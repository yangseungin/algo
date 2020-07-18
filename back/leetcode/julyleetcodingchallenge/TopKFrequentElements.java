package julyleetcodingchallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {
	public static void main(String[] args) {
		System.out.println(topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2));

	}

	public static List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> result = new ArrayList<>();
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int i : nums) {
			hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
		}
		

		List<Integer> list = new ArrayList<Integer>();
		list.addAll(hashMap.keySet());

		Collections.sort(list, new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				Object v1 = hashMap.get(o1);
				Object v2 = hashMap.get(o2);

				return ((Comparable<Object>) v1).compareTo(v2);
			}
		});

		Collections.reverse(list);

		for (int i = 0; i < k; i++) {
			result.add(list.get(i));
		}

		return result;
	}

}
