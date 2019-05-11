package lv3;

import java.util.Arrays;

public class Scale {
	public static void main(String[] args) {
		int[] weight={3, 1, 6, 2, 7, 30, 1};
		System.out.println(solution(weight));
	}
	public static int solution(int[] weight){
		int answer=1;
	
		Arrays.sort(weight);
		for(int i=0;i<weight.length;i++){
			if(answer<weight[i])
				break;
			answer+=weight[i];
		}
		
		
		return answer;
	}

}
