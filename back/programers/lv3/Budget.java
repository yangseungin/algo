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
		int max=1;
		int sum=0,mid=0;	
		
		
		//예산범위 내면 가장큰값 리
		for(int i=0;i<budgets.length;i++){
			if(max<budgets[i])
				max=budgets[i];
			sum+=budgets[i];
		}
		if(sum<=M){
			return max;
		}

		Arrays.sort(budgets);
		max=100000;
		
		while(true){
			sum=0;
			mid=(min+max)/2;
			
			if(max-min<=1)
				return min;
			
			for(int i=0;i<budgets.length;i++){
				if(budgets[i]<=mid)
					sum+=budgets[i];
				else{
					//mid보다커지면 나머지걍 중간값으로 더해버리고 치
					sum+=mid*(budgets.length-i);
					break;
				}
				
			}

			
			if(sum>M)
				max=mid;
			else 
				min=mid;
			System.out.println("max: "+max+" min: "+min+" mid: "+mid);

			
		}
		
		
		
		
		
		
		
	}

}
