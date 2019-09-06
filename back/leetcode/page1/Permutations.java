package page1;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void main(String[] args) {
		System.out.println(permute(new int[]{1,2,3}));
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		
		
		List<Integer> combination = new ArrayList<>();
		
		combine(result,combination,nums,0);
		
		return result;
		
	}
	
	public static void combine(List<List<Integer>> result,List<Integer> combination,int[] nums,int index){
		
		
		
	}
	
	

}
