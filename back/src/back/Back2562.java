package back;

import java.util.Scanner;

public class Back2562 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] arr = new int[9];
		int maxNum=0,idx=0;
		for(int i=0;i<9;i++){
			arr[i]=sc.nextInt();
			if(maxNum<arr[i]){
				maxNum=arr[i];
				idx=i;
			}
		}
		
		System.out.println(maxNum);
		System.out.println(idx+1);
		
		
	}

}
