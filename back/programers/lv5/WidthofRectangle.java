package lv5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WidthofRectangle {
	public static void main(String[] args) {
		int[][] rectangles = { { 1, 1, 6, 5 }, { 2, 0, 4, 2 }, { 2, 4, 5, 7 }, { 4, 3, 8, 6 }, { 7, 5, 9, 7 } };

		System.out.println(solution(rectangles));
	}

	public static long solution(int[][] rectangles) {
		long answer = 0;

		// xlist 선
		List xlist = new ArrayList<Integer>();

		for (int i = 0; i < rectangles.length; i++) {
			for (int j = rectangles[i][0]; j < rectangles[i][2]; j++) {
				if (!xlist.contains(j))
					xlist.add(j);
			}
		}

		//
		List rect = new ArrayList<HashSet>();
		for (int i = 0; i < xlist.size(); i++) {
			HashSet<Integer> set = new HashSet<>();
			int numX=(int) xlist.get(i);
			for (int j = 0; j < rectangles.length; j++) {
				if ((numX >= rectangles[j][0]) && (numX < rectangles[j][2])) {
					for (int k = rectangles[j][1]; k < rectangles[j][3]; k++) {
						set.add(k);
					}
				}
			}
			
			answer += set.size();

		}

		return answer;

	}

}
