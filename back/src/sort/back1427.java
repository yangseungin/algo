package sort;

import java.util.Arrays;
import java.util.Scanner;

public class back1427 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		int size= n.length();
		char[] arr = new char[size];
		
		for(int i=0;i<n.length();i++) {
			arr[i]=n.charAt(i);
		}
		Arrays.parallelSort(arr);
		
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
		
		
		

		
	}

}