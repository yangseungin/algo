package back;

import java.util.Scanner;

public class back1193 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int temp=1;

		int molecular=1;	//분자
		int denominator=1;	//분모
		
		
		while(true){
			if(num>temp)
				num-=temp;
			else
				break;
			
			temp++;
		}
		
		
		if(temp%2==1){
			molecular=temp;
			for(int i=1;i<num;i++){
				molecular-=1;
				denominator+=1;				
			}			
		}else{
			denominator=temp;
			for(int i=1;i<num;i++){
				molecular+=1;
				denominator-=1;
			}			
		}
		
		System.out.println(molecular+"/"+denominator);
		
	}
	
}
