package day30challenge;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2 /* capacity */ );

		cache.put(1, 1);
		cache.put(2, 2);
		cache.get(1); // returns 1
		cache.put(3, 3); // evicts key 2
		cache.get(2); // returns -1 (not found)
		cache.put(4, 4); // evicts key 1
		cache.get(1); // returns -1 (not found)
		cache.get(3); // returns 3
		cache.get(4); // returns 4
	}

	private int _capacity;
	private Map<Integer, Integer> map;

	public LRUCache(int capacity) {
		_capacity = capacity;
		map = new LinkedHashMap<>();

	}

	public int get(int key) {
		if (map.containsKey(key)) {
			int val = map.get(key);
			map.remove(key);
			map.put(key, val);
			System.out.println(val);
			return val;
		}
		System.out.println(-1);
		return -1;

	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			map.remove(key);
		} else if (map.size() == _capacity) {
			map.remove(map.keySet().iterator().next());
		}
		map.put(key, value);

	}

}
