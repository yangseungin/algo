package juneleetcodeingchallenge;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		reverseString(new char[] { 'h', 'e', 'l', 'l', 'o' });
	}

	public static void reverseString(char[] s) {
		int left = 0, right = s.length - 1;
		
		while (left < right) {
			char tmp = s[left];
			s[left++] = s[right];
			s[right--] = tmp;
			
		}
		System.out.println(Arrays.toString(s));

	}

}
