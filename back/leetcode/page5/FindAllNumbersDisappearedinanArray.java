package page5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
	public static void main(String[] args) {
		System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		ArrayList<Integer> result = new ArrayList<>();
		int[] tmp = new int[nums.length+1];
        for(int num:nums){
        	tmp[num]++;
        }
        for(int i =1; i <nums.length+1; i++){
            if(tmp[i] == 0)
                result.add(i);
        }
        return result;

	}

}
