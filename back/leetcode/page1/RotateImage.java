package page1;

public class RotateImage {
	public static void main(String[] args) {
		rotate(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
		// rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});

	}

	public static void rotate(int[][] matrix) {
		int[][] result=new int[matrix.length][matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++) {
			int[] tmp = new int[matrix[i].length];
			int tmpCount = 0;
			for (int j = matrix[0].length - 1; j >= 0; j--) {
				System.out.print(matrix[j][i] + " ");
				tmp[tmpCount++] = matrix[j][i];
				
			}
			System.out.println();
			
			
		}
		//이렇게 넣어줘야 바뀌네
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				matrix[i][j]=result[i][j];
			}
		}
		
		
		
	}
//	output이 바뀌지않아 통과가 안됨..
//	public static void rotate(int[][] matrix) {
//		int[][] result=new int[matrix.length][matrix[0].length];
//		
//		for (int i = 0; i < matrix.length; i++) {
//			int[] tmp = new int[matrix[i].length];
//			int tmpCount = 0;
//			for (int j = matrix[0].length - 1; j >= 0; j--) {
//				System.out.print(matrix[j][i] + " ");
//				tmp[tmpCount++] = matrix[j][i];
//				
//			}
//			System.out.println();
//			
//			result[i]=tmp;
//		}
//		matrix=result;
//		
//		
//	}

}
