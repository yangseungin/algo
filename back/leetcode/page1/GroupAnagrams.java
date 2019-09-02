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
		Map<String,String> map = new HashMap<>();
		
		
		for(String str:strs){
			char[] tmp = str.toCharArray();
			Arrays.sort(tmp);
			String sortedStr=String.valueOf(tmp);
			map.put(str, sortedStr);
		}
		List<String> subList = new ArrayList<String>();
		for(int i=0;i<strs.length;i++){
			for(int j=i+1;j<strs.length;j++){
				if(map.get(strs[i])==map.get(strs[j]))
					subList.add(map.get(strs[i]));// 이게아님
			}
		}
		
		

		return result;
	}

}
