package juneleetcodeingchallenge;

public class Hindex2 {
	public static void main(String[] args) {
		System.out.println(hIndex(new int[] { 0, 1, 3, 5, 6 }));
	}

	public static int hIndex(int[] citations) {
		int len = citations.length;

		int low = 0, high = len - 1, mid=0;

		while (low <= high) {
			mid = (low + high) / 2;

			if (len - mid > citations[mid])
				low = mid + 1;
			else
				high = mid - 1;
			
		}

		return len - low;

	}

}
