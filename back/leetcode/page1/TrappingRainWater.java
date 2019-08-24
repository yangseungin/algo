package page1;

public class TrappingRainWater {
	public static void main(String[] args) {
		System.out.println(trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));

	}

	public static int trap(int[] height) {
		int result = 0;
		int max = 0;
		int left[] = new int[height.length];
		int right[] = new int[height.length];

		if (height.length < 2)
			return result;

		max = height[0];
		left[0] = height[0];

		// 좌 -> 우
		for (int i = 1; i<height.length; i++) {

			if (height[i] < max) {
				left[i] = max;
			} else {
				left[i] = height[i];
				max = height[i];
			}

		}

		System.out.println("------");
		max = height[height.length - 1];
		right[height.length - 1] = height[height.length - 1];

		// 우 -> 좌
		for (int i = height.length - 2; i >= 0; i--) {
			if (height[i] < max) {
				right[i] = max;
			} else {
				right[i]=height[i];
				max=height[i];
			}
		}
		
		for(int i=0;i<height.length;i++){
			result+=Math.min(left[i], right[i])-height[i];
		}



		return result;
	}

}
