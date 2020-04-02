package page9;

public class PeekIndexinaMountainArray {
	public static void main(String[] args) {
		System.out.println(peakIndexInMountainArray(new int[]{0,1,0}));
	}

	public static int peakIndexInMountainArray(int[] A) {
		int i = 0;
		while (A[i] < A[i + 1]){
			i++;
		}
		return i;
	}
}
