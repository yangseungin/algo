package page8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositionsofLargeGroups {
	public static void main(String[] args) {
		System.out.println(largeGroupPositions("abbxxxxzyy"));
		
	}
	 public static List<List<Integer>> largeGroupPositions(String S) {
	        List<List<Integer>> result = new ArrayList<>();
	        int i = 0, N = S.length(); 
	        for (int j = 0; j < N; j++) {
	            if (j == N-1 || S.charAt(j) != S.charAt(j+1)) {
	                if (j-i+1 >= 3){
	                    result.add(Arrays.asList(new Integer[]{i, j}));
	                }
	                i = j + 1;
	            }
	        }

	        return result;
	    }

}
