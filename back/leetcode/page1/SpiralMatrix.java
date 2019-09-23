package page1;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args) {
		System.out.println(spiralOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
		System.out.println("=================");
		System.out.println(spiralOrder(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }));
		System.out.println("=================");
		System.out.println(spiralOrder(new int[][] { { 3 }, {2 } }));

	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		if(matrix.length==0){
			return result;
		}
		
		int rowStart = 0, rowEnd = matrix.length - 1;
		int columnStart = 0, columnEnd = matrix[0].length - 1;

		while (rowStart <= rowEnd && columnStart <= columnEnd ) {
			for (int i = columnStart; i <= columnEnd; i++) {
				result.add(matrix[rowStart][i]);
			}
			for (int i = rowStart+1; i <= rowEnd; i++) {
				result.add(matrix[i][columnEnd]);
			}
			if(rowStart<rowEnd&&columnStart<columnEnd){
				for (int i = columnEnd-1; i > columnStart; i--) {
					result.add(matrix[rowEnd][i]);
				}
			
				for (int i = rowEnd; i > rowStart; i--) {
					result.add(matrix[i][columnStart]);
				}	
			}
			
			rowEnd--;
			columnStart++;
			rowStart++;
			columnEnd--;

		}
		System.out.println();

		return result;
	}

}
