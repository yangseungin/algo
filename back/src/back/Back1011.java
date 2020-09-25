package back;

import java.util.Scanner;

public class Back1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {
			int numX = sc.nextInt();
			int numY = sc.nextInt();
			int cha = numY - numX;

			int max = (int)Math.sqrt(cha);
			if(max == Math.sqrt(cha)){
				System.out.println(max * 2 -1);
			}else if(cha <= max * max + max){
				System.out.println(max *2);
			}else{
				System.out.println(max *2 +1);
			}

		}

	}

}
