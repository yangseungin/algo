package lv5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class WidthofRectangle {
	public static void main(String[] args) {
		int[][] rectangles={{1, 1, 6, 5}, {2, 0, 4, 2}, {2, 4, 5, 7}, {4, 3, 8, 6}, {7, 5, 9, 7}};

		System.out.println(solution(rectangles));
	}

	public static long solution(int[][] rectangles) {
		long answer = 0;
		
		
		//x1 값으로 소
		Arrays.sort(rectangles,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0]-o2[0];
			}
		});

		
		//	x1값으로 소팅된것 
		for (int i = 0; i < rectangles.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(rectangles[i][j] + " ");

			}
			System.out.println();

		}
		
		// xlist 선	
		List xlist = new ArrayList<Integer>();
		
		for(int i=0;i<rectangles.length;i++){
			for(int j=rectangles[i][0];j<rectangles[i][2];j++){
				if(!xlist.contains(j))
					xlist.add(j);
			}
		}
		System.out.println("----");
		for(int i=0;i<xlist.size();i++){
			System.out.println(xlist.get(i));
		}
		System.out.println("-------");
		
		
		// 
/*		List rect = new ArrayList<HashSet>();
		for(int i=0;i<xlist.size();i++){
			//System.out.println(xlist.get(i));

			HashSet<Integer> set = new HashSet<>();
			for(int j=0;j<rectangles.length;j++){
				for(int k=rectangles[j][1];k<rectangles[j][3];k++){
					set.add(k);
				}
			}
			rect.add(set);			
			set.clear();
			
		}
		System.out.println("--------");
		System.out.println(rect.size());
		for(int i=0;i<rect.size();i++){
			System.out.println(rect.get(i));
		}*/
		
		
		
		
		
		
		return answer;

	}

}
