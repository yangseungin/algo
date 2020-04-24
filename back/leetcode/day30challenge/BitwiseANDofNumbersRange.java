package day30challenge;

public class BitwiseANDofNumbersRange {
	public static void main(String[] args) {
		System.out.println(rangeBitwiseAnd(5, 7));
	}

	public static int rangeBitwiseAnd(int m, int n) {
		while (n > m) {
			n = n & n - 1;
		}
		
		return n & m;
	}

}
