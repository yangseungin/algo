package open1;

import java.util.Scanner;

public class Back1934 {
	public static void main(String[] args) {

		 //유클리드 호제법으로 최대공약수 구한후 최대공약수로 쭉 나눈값과 최대공약수를 곱해 최소공배수를 구함
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] result= new int[n];
		
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			int b = sc.nextInt();
			int tmp=0;
			if(a<b){
				tmp=a;
				a=b;
				b=tmp;
			}			
			int gcd=gcd(a,b);
			
			a/=gcd;
			b/=gcd;
			result[i]=a*b*gcd;
			
			
		}
		for(int i=0;i<n;i++){
			System.out.println(result[i]);
		}
		
	}

	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		return gcd(q, p % q);
	}

}
