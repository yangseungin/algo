package back;

import java.util.Arrays;
import java.util.Scanner;

public class Back3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numX=new int[3];
		int[] numY=new int[3];
		
		for(int i=0;i<3;i++){
			numX[i]=sc.nextInt();
			numY[i]=sc.nextInt();
		}
		Arrays.sort(numX);
		Arrays.sort(numY);
		if(numX[0]==numX[1])
			System.out.print(numX[2]+" ");
		else if(numX[1]==numX[2])
			System.out.print(numX[0]+" ");
		else
			System.out.println(numX[1]+" ");
		

		if(numY[0]==numY[1])
			System.out.print(numY[2]);
		else if(numY[1]==numY[2])
			System.out.print(numY[0]);
		else
			System.out.println(numX[1]);
		
	
	
	}

}
