package page2;

public class MissingNumber {
	public static void main(String[] args) {
		System.out.println(missingNumber(new int[]{3,0,1}));
	}
	public static int missingNumber(int[] nums){
		//n*(n+1)/2=s
		int sum=0;
		for(int num:nums){
			sum+=num;
		}
		return nums.length*(nums.length+1)/2-sum;
	}

}
