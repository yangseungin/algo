package highscorekit.stackqueue;

import java.util.Arrays;
import java.util.Stack;

public class Tower {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(new int[]{6,9,5,7,4})));
	}
	public static int[] solution(int[] heights){
		int[] answer=new int[heights.length];
		
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<heights.length;i++){
			stack.push(heights[i]);
		}
		
		
		for(int i=heights.length-1;i>0;i--){
			int tmp=stack.peek();
			for(int j=i-1;j>=0;j--){
				if(heights[j]>tmp){
					answer[i]=j+1;
					break;
				}
			}
			stack.pop();
		}
		
		return answer;		
	}

}
