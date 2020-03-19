package page9;

public class MonotonicArray {
	public static void main(String[] args) {
		System.out.println(isMonotonic(new int[]{1,2,2,3,4}));
	}

	public static boolean isMonotonic(int[] A) {
		int save = 0;
		for (int i = 0; i < A.length - 1; i++) {
			int c = Integer.compare(A[i], A[i + 1]);
			if (c != 0) {
				if (c != save && save != 0)
					return false;
				save = c;
			}
		}

		return true;
	}

}
