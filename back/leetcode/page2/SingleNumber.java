package page2;

import java.util.HashSet;

public class SingleNumber {
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{2,2,1}));
		System.out.println(singleNumber(new int[]{4,1,2,1,2}));
		
	}
	public static int singleNumber(int[] nums){
		
		HashSet<Integer> hashset = new HashSet<>();
		int result=0;
		for(int i:nums){
			if(hashset.contains(i)){
				hashset.remove(i);
			}else{
				hashset.add(i);
			}
		}
		
		for(int i:hashset){
			result=i;
		}
		
		
		
		return result;
	}

}
