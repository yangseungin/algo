package lesson3;

public class PermMissingElem {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 2, 3, 1, 5 }));

	}

	public static int solution(int[] A) {
		long sum = 0;

		for (int num : A) {
			sum += num;
		}

		return (int) ((long) (A.length + 1) * (A.length + 2) / 2 - sum);
	}
}
