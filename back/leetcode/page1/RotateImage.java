package page1;

public class RotateImage {
	public static void main(String[] args) {
		rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
	}
	public static void rotate(int[][] matrix){
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
