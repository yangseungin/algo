package back;

import java.util.Scanner;

public class Back1904 {
	public static void main(String[] args) {
		// 쭉적어서 나열해보면 n-2번째에서 00을 붙이고 n-1번째에서 뒤에 1만붙인게 n번째값이라 n = n-1번쨰 + n-2번째가
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] dp = new int[n+1];
		dp[1]=1;
		dp[2]=2;
		
		for(int i=3;i<=n;i++){
			dp[i]=(dp[i-1]+dp[i-2])%15746;
		}
		
		System.out.println(dp[n]);
		
	}

}
