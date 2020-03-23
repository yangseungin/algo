package page9;

import java.util.Arrays;

public class SortArrayByParity {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortArrayByParity(new int[]{3,1,2,4})));
	}

	public static int[] sortArrayByParity(int[] A) {
		
		return Arrays.stream(A)
				.boxed()
				.sorted((a,b)-> Integer.compare(a%2,b%2))
				.mapToInt(i->i)
				.toArray();

	}

}
