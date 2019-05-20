package lv3;

import java.util.Arrays;

public class Budget {
	public static void main(String[] args) {
		
		int[] budgets = {120, 110, 140, 150};
		int M = 485;
		
		
		System.out.println(solution(budgets,M));
		
		
	}
	public static int solution(int[] budgets,int M){
		int min=0;
		int max=0;
		int sum=0,mid=0;	
		
		
		

		Arrays.sort(budgets);
		max=budgets[budgets.length-1];
		
		while(min<=max){
			sum=0;
			mid=(min+max)/2;
			
			
			for(int i=0;i<budgets.length;i++){
				sum = budgets[i]>mid?sum+mid:sum+budgets[i];
			}
			
			
			if(sum>M)
				max=mid-1;
			else 
				min=mid+1;
			System.out.println("max: "+max+" min: "+min+" mid: "+mid);

			
		}
		return max;
		
		
		
		
		
		
		
	}

}
