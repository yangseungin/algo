package sort;

import java.util.Arrays;
import java.util.Scanner;

public class back2108 {
	public static void main(String[] args) {
		
		int[] count= new int[8001];
			
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		float sum=0;
		int maxNum=-4000, minNum=4000;
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
			count[arr[i]+4000]++;
			maxNum=Math.max(maxNum,arr[i]);
			minNum=Math.min(minNum, arr[i]);			
		}
		float average=sum/n;
		
		
		Arrays.sort(arr);
		
		
		
		
	}

}