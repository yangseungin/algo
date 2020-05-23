package mayleetcodingchallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
	public static void main(String[] args) {
		System.out.println(frequencySort("tree"));
	}

	public static String frequencySort(String s) {
		StringBuilder result = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		PriorityQueue<Character> que = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

		que.addAll(map.keySet());

		while (!que.isEmpty()) {
			char cur = que.remove();
			for (int i = 0; i < map.get(cur); i++) {
				result.append(cur);
			}
		}
		return result.toString();
	}
}
