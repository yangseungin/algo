package julyleetcodingchallenge;

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
		System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1})));
	}
	public static int[] plusOne(int[] digits) {
	       int[] result = new int[digits.length+1];
			int len = digits.length;
			
			digits[len-1]=digits[len-1]+1;
			if(digits[len-1]<10){
				return digits;
			}
			
			for(int i=digits.length-1;i>0;i--){
				if(digits[i]>9){
					carry(i,digits);
				}
			}
			
			
			if(digits[0]<10){
				return digits;
			}
			
			result[0]=1;
			
			
			
			

			return result;
	    }
	    public static void carry(int index, int[] digits) {
			digits[index] = 0;
			digits[index - 1] = digits[index - 1] + 1;
			
		}

}
