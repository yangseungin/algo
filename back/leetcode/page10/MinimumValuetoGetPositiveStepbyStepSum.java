package page10;

public class MinimumValuetoGetPositiveStepbyStepSum {
    public static void main(String[] args) {
        System.out.println(minStartValue(new int[]{-3, 2, -3, 4, 2}));
    }

    public static int minStartValue(int[] nums) {
        int start = 1, min = 1;
        for (int num : nums) {
            start += num;
            if (start < 1) {
                min += Math.abs(start) + 1;
                start = 1;
            }
        }
        return min;
    }
}
