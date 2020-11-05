package challenges1.chall2;

import java.util.Arrays;

public class Q2 {
	public static int[][] quard;
	public static int count0=0;
	public static int count1=0;
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[][]{{1,1,0,0}, {1,0,0,0},{1,0,0,1},{1,1,1,1}})));
	}

	public static int[] solution(int[][] arr) {
		int[] answer = new int[2];
		int n= arr.length;
		quard = new int[n][n];
		for(int i=0;i<n;i++){
			for (int j = 0; j < n; j++) {
				quard[i][j] = arr[i][j];
			}
		}
		search(0,0,n);

		answer[0]=count0;
		answer[1]=count1;
		return answer;
	}
	public static void search(int row, int col, int size){
		if(!check(row,col,size)){
			int newSize=size/2;
			search(row,col,newSize);
			search(row,col+newSize,newSize);
			search(row+newSize,col,newSize);
			search(row+newSize,col+newSize,newSize);
		}

	}
	public static boolean check(int row, int col, int size){
		int t = quard[row][col];
		for(int i=row;i<row+size;i++){
			for(int j=col;j<col+size;j++){
				if(t !=quard[i][j])
					return false;
			}
		}
		if(t==0)
			count0++;
		else
			count1++;
		return true;
	}

}
