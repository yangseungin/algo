package page5;

public class NumberComplement {
	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}

	public static int findComplement(int num) {
		String binarystring = Integer.toBinaryString(num);
		return num^((1 << binarystring.length())-1);
	}

}
