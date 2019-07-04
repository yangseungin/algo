package back;

import java.util.Scanner;

public class Back2798 {

	// 재귀로 풀어도되고 3중 for문으로 풀어도
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int num = sc.nextInt();
		int answer=0;
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < count; i++) {
			for(int j=0;j<count;j++){
				for(int k=0;k<count;k++){
					if (i != j && j != k && k != i) {
			            int sum = arr[i] + arr[j] + arr[k];
			            if (sum <= num && answer < sum) answer = sum;
			        }

				}
			}
		}
		
		System.out.println(answer);
		
	}

}
