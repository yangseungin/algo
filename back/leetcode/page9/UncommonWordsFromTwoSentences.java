package page9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsFromTwoSentences {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
	}

	public static String[] uncommonFromSentences(String A, String B) {
		Map<String, Integer> count = new HashMap<>();
		for (String word : A.split(" "))
			count.put(word, count.getOrDefault(word, 0) + 1);
		for (String word : B.split(" "))
			count.put(word, count.getOrDefault(word, 0) + 1);

		List<String> result = new ArrayList<>();
		for (String word : count.keySet())
			if (count.get(word) == 1)
				result.add(word);

		return result.toArray(new String[result.size()]);
	}

}
