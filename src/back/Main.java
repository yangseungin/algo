package back;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		for(int i = num1; i<num2+1; i++){			
			if(checkPrimeNum(i))
				System.out.println(i);
			
		}
		
		
	
		
		
		
		
	}
	public static void selfNumPrint(){
		
		boolean[] arrList;
		arrList = new boolean[100001];
		Arrays.fill(arrList,false);
		
		for(int i=1;i<10001;i++){
			int idx = selfNum(i);
			
			if(idx<= 10001){
				arrList[idx]=true;
			}			
		}
		for(int i=1;i<10001;i++){
			if(!arrList[i])
				System.out.println(i);
				
			
			
			
		}		
		
		
	}
	
	public static int selfNum(int num) {
		
		int sum=num;

		
		while(true){
			if(num == 0) break;
			sum+=num%10;
			num= num/10;
			
		}
		
		return sum;

	}
	
	public static boolean checkPrimeNum(int num) {
		if (num <= 1)
			return false;
		else if (num == 2)
			return true;
		else if (num % 2 == 0)
			return false;
		else {
			for (int i = 3; i <= Math.sqrt(num); i += 2) {
				if (num % i == 0)
					return false;
			}
		}
		return true;

	}
	
}
