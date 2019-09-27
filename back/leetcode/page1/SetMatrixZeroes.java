package page1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetMatrixZeroes {
	public static void main(String[] args) {
		setZeroes(new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } });
		System.out.println("=============");
		setZeroes(new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } });
		System.out.println("=============");
		setZeroes(new int[][] { { 0, 1 } });
	}

	public static void setZeroes(int[][] matrix) {
		HashSet<Integer> xPoint = new HashSet<>();
		HashSet<Integer> yPoint = new HashSet<>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					xPoint.add(i);
					yPoint.add(j);
				}
			}
		}
		// 행열  0 으로
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[0].length;j++) {
				if (xPoint.contains(i) || yPoint.contains(j)) {
					matrix[i][j] = 0;
				}
			}
		}

		printArr(matrix);
	}

	public static void printArr(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
