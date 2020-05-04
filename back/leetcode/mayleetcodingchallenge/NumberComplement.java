package mayleetcodingchallenge;

public class NumberComplement {
	public int findComplement(int num) {
		String binarystring = Integer.toBinaryString(num);
		return num ^ ((1 << binarystring.length()) - 1);
	}

}
