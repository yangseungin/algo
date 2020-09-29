package array_vectorsort_stringparsing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Back11650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr =new int[n][2];
		for(int i=0;i<n;i++){
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		Arrays.sort(arr,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0]==o2[0]) return Integer.compare(o1[1], o2[1]);
				else return Integer.compare(o1[0], o2[0]);
				
			}
		});
		for(int i=0;i<n;i++){
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}

}
