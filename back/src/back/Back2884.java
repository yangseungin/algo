package back;

import java.util.Scanner;

public class Back2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hh=sc.nextInt();
		int mm=sc.nextInt();
		
		if(mm>=45)
			mm-=45;
		else{
			if(hh-1<0)
				hh=23;
			else
				hh-=1;
			mm+=15;
			
		}
		System.out.println(hh +" "+mm);
	}

}
