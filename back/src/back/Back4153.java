package back;

import java.util.Arrays;
import java.util.Scanner;

public class Back4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num= new int[3];
		
		while(true){
			for(int i=0;i<3;i++){
				num[i]=sc.nextInt();
			}
			if(num[0]==0&&num[1]==0&&num[2]==0)
				break;
			Arrays.sort(num);
			if(num[0]*num[0]+num[1]*num[1]==num[2]*num[2])
				System.out.println("right");
			else
				System.out.println("wrong");
			
			
		}
	}

}
