package lesson3;

public class TapeEquilibrium {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{3,1,2,4,3}));
	}
	public static int solution(int[] A){
		int sum=0;
		int min=Integer.MAX_VALUE;
		for(int num:A){
			sum+=num;
		}
		int tmp=0;
		for(int i=0;i<A.length-1;i++){
			tmp+=A[i];
			sum-=A[i];
			if(min>Math.abs(tmp-sum)){
				min=Math.abs(tmp-sum);
			}
		}
		
		
		
		
		return min;
	}

}
