package top_100_liked_questions;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sumLength = nums1.length + nums2.length;
        int[] merge = new int[sumLength];

        int num1Idx = 0, num2Idx = 0;
        for (int i = 0; i < sumLength; i++) {
            if (num1Idx == nums1.length) {
                merge[i] = nums2[num2Idx++];
            } else if (num2Idx == nums2.length) {
                merge[i] = nums1[num1Idx++];
            } else {
                if (nums1[num1Idx] < nums2[num2Idx]) {
                    merge[i] = nums1[num1Idx++];
                } else {
                    merge[i] = nums2[num2Idx++];
                }
            }
        }
        return sumLength % 2 == 1 ? merge[sumLength / 2] : (double) (merge[sumLength / 2] + merge[sumLength / 2 - 1]) / 2;
    }
}
