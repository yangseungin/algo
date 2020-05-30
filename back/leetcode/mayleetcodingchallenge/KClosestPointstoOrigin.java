package mayleetcodingchallenge;

import java.util.Arrays;

public class KClosestPointstoOrigin {
	public static void main(String[] args) {
		for (int[] a : kClosest(new int[][] { { 1, 3 }, { -2, 2 } }, 1)) {
			System.out.println(a[0] + " / " + a[1]);
		}
	}

	public static int[][] kClosest(int[][] points, int K) {
		int len = points.length;
		int[] distances = new int[len];
		int[][] ans = new int[K][2];

		for (int i = 0; i < len; i++) {
			distances[i] = distance(points[i]);
		}

		Arrays.sort(distances);

		int tmp = 0;
		for (int i = 0; i < len; i++) {
			if (distance(points[i]) <= distances[K - 1])
				ans[tmp++] = points[i];
		}

		return ans;
	}

	public static int distance(int[] point) {
		return point[0] * point[0] + point[1] * point[1];
	}

}
