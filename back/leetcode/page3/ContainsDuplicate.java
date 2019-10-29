package page3;

import java.util.HashSet;

public class ContainsDuplicate {
	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[]{1,2,3,1}));

	}

	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> hashset = new HashSet<>();
		
		for(int i:nums){
			if(hashset.contains(i)){
				return true;
			}else{
				hashset.add(i);
			}
		}
		return false;
	}

}
