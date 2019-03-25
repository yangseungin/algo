package back;

import java.util.Scanner;

public class back2839 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count5 = 0;
		int count3 =0;
		
		
		while(true) {
			if(input%5!=0 &&input>=0) {
				input -=3;
				count3++;
		
			}else {
				break;
			}
		}
		if(input<0) {
			System.out.println(-1);
		}
		else {
			count5=input/5;
			System.out.println(count3+count5);
		}
		
			
		
			
			
			
		
	

	}

}
