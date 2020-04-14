package day30challenge;

import java.util.Arrays;

public class LargestPerimeterTriangle {
	public static void main(String[] args) {
		System.out.println(largestPerimeter(new int[] { 2, 1, 2 }));
		System.out.println(largestPerimeter(new int[] { 1, 2, 1, }));
		System.out.println(largestPerimeter(new int[] { 3, 2, 3, 4, }));
		System.out.println(largestPerimeter(new int[] { 3, 6, 2, 3 }));

	}

	public static int largestPerimeter(int[] A) {
		Arrays.sort(A);

		for (int i = A.length - 3; i >= 0; i--) {
			if (A[i] + A[i + 1] > A[i + 2])
				return A[i] + A[i + 1] + A[i + 2];

		}

		return 0;
	}

}
