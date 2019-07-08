package back;

import java.util.Scanner;

public class Back11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=sc.nextInt();
		int sum=sc.nextInt();
		int tmp=0;
		int[] arr = new int[count+1];
		for(int i=1;i<=count;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=count;i>0;i--){
			tmp+=sum/arr[i];
			sum%=arr[i];
		}
		System.out.println(tmp);
	}

}
