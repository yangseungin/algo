package page5;

public class ConstructRectangle {
	public static void main(String[] args) {
		System.out.println(constructRectangle(4));
	}

	public static int[] constructRectangle(int area) {
		for (int i = (int) Math.sqrt(area); i >= 1; i--) {
			if (area % i == 0) {
				return new int[] { area / i, i };
			}
		}
		return null;

	}

}
