package page4;

import java.util.Arrays;

public class KthSmallestElementinaSortedMatrix {
	public static void main(String[] args) {
		System.out.println(kthSmallest(new int[][] { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } }, 8));
	}

	public static int kthSmallest(int[][] matrix, int k) {
		int[] arr = new int[matrix.length * matrix[0].length];
		int index = 0;
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++) {
				arr[index] = matrix[i][j];
				index++;
			}
		Arrays.sort(arr);
		return arr[k - 1];
	}

}
