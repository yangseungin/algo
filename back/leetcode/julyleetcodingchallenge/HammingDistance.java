package julyleetcodingchallenge;

public class HammingDistance {
	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 4));
		
	}
	public static int hammingDistance(int x, int y) {
		int diff = 0;
		while (x > 0 || y > 0) {
			if ((x & 1) != (y & 1)) {
				diff++;
			}
			y = y >> 1;
			x = x >> 1;
		}
		return diff;
	}
}
