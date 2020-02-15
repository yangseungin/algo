package page7;

public class BinaryNumberWithAlternatingBits {
	public static void main(String[] args) {

		System.out.println(hasAlternatingBits(5));
	}

	public static boolean hasAlternatingBits(int n) {
		String bits = Integer.toBinaryString(n);
		for (int i = 0; i < bits.length()-1; i++) {
			if(bits.charAt(i) == bits.charAt(i + 1)) {
				return false;
			}
		}

		return true;
	}

}
