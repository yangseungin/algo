package day30challenge;

import java.util.Arrays;
import java.util.TreeMap;

public class FindRightInterval {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(findRightInterval(new int[][]{{3,4}, {2,3}, {1,2}})));
	}
	 public static int[] findRightInterval(int[][] intervals) {
	        TreeMap<Integer, Integer> map = new TreeMap<>();
	        for(int i=0; i<intervals.length; i++){
	            map.put(intervals[i][0], i);
	        }
	        
	        int[] ans = new int[intervals.length];
	        for(int i=0; i<intervals.length; i++){
	            Integer point = map.ceilingKey(intervals[i][1]);
	            ans[i]= point==null ? -1 : map.get(point);
	        }
	        return ans;
	 }

}
