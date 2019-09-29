package page1;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
	public static void main(String[] args) {
		merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
	}
public static int[][] merge(int[][] intervals) {
        
		int[][] result=new int[3][3];
		
		Arrays.sort(intervals,new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				
				return Integer.compare(o1[1], o2[1]);
			}
		});
		
		for(int i=0;i<intervals.length;i++){
			System.out.println(intervals[i][0]+" / "+intervals[i][1]);
		}
		
		
		
		
		
		return result;
    }

}
