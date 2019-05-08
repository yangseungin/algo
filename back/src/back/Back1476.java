package back;

import java.util.Scanner;

public class Back1476 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year=1;
		
		int E=sc.nextInt();
		int S=sc.nextInt();
		int M=sc.nextInt();
		while(true){
			if((year-E)%15==0&&(year-S)%28==0&&(year-M)%19==0){
				System.out.println(year);
				break;
			}
			year++;
		}
	}

}
