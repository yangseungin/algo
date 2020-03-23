package page9;

import java.util.Stack;

public class ReverseOnlyLetters {
	public static void main(String[] args) {
		System.out.println(reverseOnlyLetters("ab-cd"));
	}

	public static String reverseOnlyLetters(String S) {
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(char c:S.toCharArray()){
			if(Character.isLetter(c)){
				stack.push(c);
			}
		}
		
		for(char c:S.toCharArray()){
			if(Character.isLetter(c)){
				sb.append(stack.pop());
			}else{
				sb.append(c);
			}
		}
		

		return sb.toString();
	}

}
