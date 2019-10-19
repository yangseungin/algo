package page2;

import java.util.Arrays;

public class TwoSum2 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
	}

	public static int[] twoSum(int[] numbers, int target) {
		int low = 0, high = numbers.length - 1;
        int sum;
        while(low < high){
            sum = numbers[low] + numbers[high];
            if(sum == target)
                return new int[]{ low + 1, high + 1};
            else if(sum < target){
                ++low;
            } else {
                --high;
            }
        }
        
        return new int[]{ 0, 0};
	}

}
