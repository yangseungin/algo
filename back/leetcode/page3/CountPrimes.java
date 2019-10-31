package page3;

public class CountPrimes {
	public static void main(String[] args) {
		System.out.println(countPrimes(10));
	}

	public static int countPrimes(int n) {
		int result = 0;;
		
		boolean[] primeArr = new boolean[n];
		for (int i = 0; i < n; i++) {
			primeArr[i] = true;
		}

		for (int i = 2; i < n; i++) {
			if (primeArr[i]) {
				for (int j = i + i; j < n; j += i)
					primeArr[j] = false;
			}
		}

		for (int i = 2; i < n; i++) {
			if (primeArr[i])
				result++;
		}

		return result;
	}

}
