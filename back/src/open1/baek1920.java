package open1;

import java.util.HashSet;
import java.util.Scanner;

public class baek1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		HashSet<Integer> hash = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			hash.add(sc.nextInt());
		}
		
		int n2=sc.nextInt();
		int[] result=new int[n2];
		for(int i=0;i<n2;i++) {
			if(hash.contains(sc.nextInt()))
				result[i]=1;
			else
				result[i]=0;
			
		}
		for(int i=0;i<n2;i++) {
			System.out.println(result[i]);
		}
		
		
		
		
	}
}
