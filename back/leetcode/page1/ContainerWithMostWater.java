package page1;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
	}

	public static int maxArea(int[] height) {
		int leftIdx = 0;
		int rightIdx = height.length - 1;
		int max = 0;
		while (leftIdx < rightIdx) {
			int min = Math.min(height[leftIdx], height[rightIdx]);
			max = Math.max(max, min * (rightIdx - leftIdx));
			if (height[leftIdx] > height[rightIdx]) {
				rightIdx--;
			} else {
				leftIdx++;
			}

		}

		return max;
	}

}
