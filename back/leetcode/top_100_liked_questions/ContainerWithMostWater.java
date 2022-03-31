package top_100_liked_questions;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));

    }

    public static int maxArea(int[] height) {
        int leftIdx = 0, rightIdx = height.length - 1;
        int max = Integer.MIN_VALUE;

        while (leftIdx < rightIdx) {
            int minHeight = Math.min(height[leftIdx], height[rightIdx]);
            max = Math.max(max, minHeight * (rightIdx - leftIdx));
            if (height[leftIdx] > height[rightIdx]) {
                rightIdx--;
            } else {
                leftIdx++;
            }
        }

        return max;
    }

}
