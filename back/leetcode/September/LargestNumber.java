package September;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{10, 2}));
    }

    public static String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strNums,(num1,num2) ->(num2+num1).compareTo(num1+num2));
        StringBuilder sb = new StringBuilder();
        for(String str: strNums){
            sb.append(str);
        }

        return sb.toString().charAt(0)=='0'? "0":sb.toString();
    }
}
