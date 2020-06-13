package page10;

import java.util.Arrays;

public class HeightChecker {
	public static void main(String[] args) {
		System.out.println(heightChecker(new int[] { 1, 1, 4, 2, 1, 3 }));
	}

	public static int heightChecker(int[] heights) {
		int[] cloneHeights = heights.clone();
		Arrays.sort(cloneHeights);
		int count = 0, idx = 0;

		for (int h : heights) {
			if (cloneHeights[idx++] != h){
				count++;
			}
		}
		return count;
	}
}
