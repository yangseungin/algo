package page1;

public class UniqueBinarySearchTrees {
	public static void main(String[] args) {
		System.out.println(numTrees(2));
		System.out.println(numTrees(3));
		System.out.println(numTrees(4));
		System.out.println(numTrees(5));
		System.out.println(numTrees(6));
		System.out.println(numTrees(7));
	}
	public static int numTrees(int n){
		int[] dp = new int[n+1];
	
		dp[0]=1;
		dp[1]=1;
		
		
		for(int i=2;i<dp.length;i++){
			int sum = 0;
            for(int root = i; root >= 1; root--) {
                sum = sum + dp[i-root]*dp[root-1]; 
            }
            dp[i] = sum;
		}
		
		
		
		return dp[n];
	}

}
