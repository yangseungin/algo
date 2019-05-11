package back;

import java.util.Arrays;
import java.util.Scanner;

public class Back2437 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] weight = new int[n];
		
		int answer=1;
		for(int i=0;i<n;i++){
			weight[i]=sc.nextInt();
		}
		
		Arrays.sort(weight);
		for(int i=0;i<weight.length;i++){
			if(answer<weight[i])
				break;
			answer+=weight[i];
		}
		
		System.out.println(answer);
	}

}
