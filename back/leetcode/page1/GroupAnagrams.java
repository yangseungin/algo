package page1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static void main(String[] args) {
		System.out.println(groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bad" }));

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
		Map<String,List<String>> map = new HashMap<>();
		
		
		for(String str:strs){
			char[] tmp = str.toCharArray();
			Arrays.sort(tmp);
			String sortedStr=String.valueOf(tmp);
			
			if(map.containsKey(sortedStr)){
				map.get(sortedStr).add(str);
			}else{
				List<String> addList = new ArrayList<>();
				addList.add(str);
				map.put(sortedStr, addList);
			}
		}

		for(String key:map.keySet()){
			List<String> printList =map.get(key);
			if(printList.size()>0){
				result.add(printList);
			}
			
		}
		
		
		

		return result;
	}

}
