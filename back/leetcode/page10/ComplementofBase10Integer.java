package page10;

public class ComplementofBase10Integer {
	public static void main(String[] args) {
		System.out.println(bitwiseComplement(5));
	}

	public static int bitwiseComplement(int N) {
		if (N == 0)
			return 1;

		int result = 0;
		int exp = 0;
		while (N != 0) {
			if (N % 2 == 0) {
				result += Math.pow(2, exp);
			}
			exp++;
			N = N / 2;
		}

		return result;
	}

}
