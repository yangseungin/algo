package page5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		System.out.println(frequencySort("tree"));
		System.out.println(frequencySort("cccaaa"));
		System.out.println(frequencySort("Aabb"));

	}

	public static String frequencySort(String s) {
		StringBuilder sb = new StringBuilder();
		
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
		Collections.sort(list,(e1,e2)-> e2.getValue()-e1.getValue());
		for(Map.Entry<Character,Integer>entry:list){
			for(int i=0;i<entry.getValue();i++){
				sb.append(entry.getKey());
			}
		}
		return sb.toString();
	}

}
