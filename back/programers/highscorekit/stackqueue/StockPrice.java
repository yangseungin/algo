package highscorekit.stackqueue;

import java.util.Arrays;

public class StockPrice {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 2, 3 })));
	}

	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		
		for(int i=0;i<prices.length;i++){
			int start=prices[i];
			for(int j=i+1,count=0;j<prices.length;j++){
				System.out.println(start+" / "+j+" / "+prices[j]);
				if(start<=prices[j])
					count+=1;
				else{
					count+=1;
					answer[i]=count;
					break;
				}
				
				
				answer[i]=count;
			}
			System.out.println("-----------");
		}
		answer[prices.length-1]=0;
			

		return answer;
	}

}
