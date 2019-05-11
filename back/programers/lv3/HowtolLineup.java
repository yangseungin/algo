package lv3;

import java.util.ArrayList;
import java.util.List;

public class HowtolLineup {
	public static void main(String[] args) {
		int n = 3;
		long k = 5;

		int[] result=solution(n,k);
		for(int i=0;i<n;i++){
			System.out.println(result[i]);
		}
	}

	public static int[] solution(int n, long k) {
		long fact = 1;
		int[] answer = new int[n];
		int idx = 0;
		
		List<Integer> people = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			fact *= i;
			people.add(i);
		}
		
		k--;
		while (n > 0) {
			fact /= n--;
			answer[idx]=people.get((int) (k/fact));			
			people.remove((int)(k/fact));			
			k%=fact;
			idx++;

		}

		return answer;

	}


}
