package sort;

import java.util.Scanner;

public class Main {


	static int count0;
	static int count1;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			int tempNum=sc.nextInt();
			int result=0;
			count0=0;
			count1=0;
			result= fibonacci(tempNum);
			
			
			
			System.out.println(count0+" "+count1);
		}
		


		/*Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] num;
		num=new int[size];
		
		for(int i=0;i<size;i++){
			num[i]=sc.nextInt();
		}
		
		for(int i=0; i<size;i++){
			
			
		}
		for(int i=0;i<size;i++){
			System.out.println(num[i]);
		}
	
		*/
		
	}
	 static int fibonacci(int n) {
	    if (n == 0) {
	    	count0++;
	        return 0;
	    } else if (n == 1) {
	    	count1++;
	        return 1;
	    } else {
	        return fibonacci(n-1) + fibonacci(n-2);
	    }
	}
	
}
