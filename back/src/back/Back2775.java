package back;

import java.util.Scanner;

public class Back2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=sc.nextInt();
		
		int[][] arr = new int[15][15];
		for (int i = 0; i < 15; i++) {
			arr[i][0]=1;
			arr[0][i]=i+1;
		}
		
		for(int i=1;i<15;i++){
			for(int j=1;j<15;j++){
				arr[i][j]=arr[i-1][j]+arr[i][j-1];
			}
		}
		
		for(int i=0;i<count;i++){
			int k=sc.nextInt();
			int n=sc.nextInt();
			System.out.println(arr[k][n-1]);
		}
		
		
	}

}
