package back;

import java.util.Scanner;

public class Back3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer=0;
		int[] arr = new int[42];
		for(int i=0;i<10;i++){
			arr[sc.nextInt()%42]++;
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0)
				answer++;
		}
		System.out.println(answer);
	}

}
