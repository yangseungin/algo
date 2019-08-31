package lesson2;

import java.util.Arrays;

public class CyclicRotation {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{3,8,9,7,6},3)));
		System.out.println(Arrays.toString(solution(new int[]{1,1,1},1)));
		System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,},4)));
		System.out.println(Arrays.toString(solution(new int[]{},0)));
	}
	
	public static int[] solution(int[] A, int K){
		int[] result=new int[A.length];
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 0 1 2 3 4 0
		if(A.length==0){
			return A;
		}		
		K=K%A.length; // 숫자가 커져봐야 의미 없음. 

		if(K==0){
			return A;
		}
		
		
		for(int i=0;i<A.length;i++){
			result[(i+K)%A.length]=A[i];
		}
		
		
		
		
		return result;
	}

}
