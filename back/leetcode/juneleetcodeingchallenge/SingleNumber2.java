package juneleetcodeingchallenge;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber2 {
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{2,2,2,3}));
	}
	

	
	public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int result = 0;
		for (int i : nums) {
			
			if(map.containsKey(i)){
				map.put(i, map.get(i) + 1);	
			}else{
				map.put(i, 1);
			}
		}

		for (int key : map.keySet()) {
			if(map.get(key)==1){
				result=key;
			}
		}

		return result;
    }
}
