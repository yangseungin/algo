package page1;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public static void main(String[] args) {
		System.out.println(combine(4, 2));
	}

	// Output:
	// [
	// [2,4],
	// [3,4],
	// [2,3],
	// [1,2],
	// [1,3],
	// [1,4],
	// ]
	//nCr = n-1Cr-1 + n-1Cr
	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> comb = new ArrayList<>();
		combin(result,comb,n,k,1);

		return result;
	}
	public static void combin(List<List<Integer>> result,List<Integer> comb,int n,int k,int start){
		
		if(k==0){
			result.add(new ArrayList<Integer>(comb));
			return;
		}
		for(int i=start;i<=n;i++){
			System.out.println(i+" "+n+" "+ k);
			comb.add(i);
			combin(result,comb,n,k-1,i+1);
			comb.remove(comb.size()-1);
			
		}
	}

}
