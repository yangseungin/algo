package highscorekit.hash;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Camouflage {
	public static void main(String[] args) {
		System.out.println(solution(new String[][] { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } }));

	}

	public static int solution(String[][] clothes) {
		int answer = 0;
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

		for (int i = 0; i < clothes.length; i++) {
			if (hashmap.containsKey(clothes[i][1]))
				hashmap.replace(clothes[i][1], hashmap.get(clothes[i][1]) + 1);
			else {
				hashmap.put(clothes[i][1], 1);
			}
		}

		//Set<Entry<String, Integer>> set = hashmap.entrySet();

		answer = 1;
		for(int count:hashmap.values()){
			answer*=(count+1);
		}
		answer-=1;

		return answer;
	}

}
