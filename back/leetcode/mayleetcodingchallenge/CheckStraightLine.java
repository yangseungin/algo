package mayleetcodingchallenge;

public class CheckStraightLine {
	public static void main(String[] args) {
		System.out.println(checkStraightLine(new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}));
	}

	public static boolean checkStraightLine(int[][] coordinates) {
		for (int i = 2; i < coordinates.length; i++) {
			if (!checkLine(coordinates[i], coordinates[0], coordinates[1]))
				return false;
		}
		return true;

	}

	public static boolean checkLine(int[] p1, int[] p2, int[] p3) {
		return ((p1[1] - p2[1]) * (p3[0] - p2[0]) == (p3[1] - p2[1]) * (p1[0] - p2[0]));
	}

}
