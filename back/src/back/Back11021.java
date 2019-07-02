package back;

import java.util.Scanner;

public class Back11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=sc.nextInt();
		int num1=0,num2=0;
		for(int i=0;i<count;i++){
			num1=sc.nextInt();
			num2=sc.nextInt();
			System.out.println("Case #"+(i+1)+": "+(num1+num2));
		}
	}

}
