package demokakao;

import java.util.Stack;

public class Q1 {
	public static void main(String[] args) {
		System.out.println(solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}));
		
		//{0,0,0,0,0},
		//{0,0,1,0,3},
		//{0,2,5,0,1},
		//{4,2,4,4,2},
		//{3,5,1,3,1}
		
		//{0,0,0,0,0},
		//{0,0,0,0,0},
		//{0,0,5,0,0},
		//{0,2,4,0,2},
		//{0,5,1,3,1}
		
	}
	
	public static int solution(int[][] board, int[] moves) {
		Stack<Integer> stack = new Stack<>();
        int answer = 0;
        
		for(int i=0;i<moves.length;i++){
			for(int j=0;j<board.length;j++){
				if(board[j][moves[i]-1]!=0){
										
					if(stack.empty()){
						stack.push(board[j][moves[i]-1]);
						board[j][moves[i]-1]=0;
						break;
					}else if(stack.peek()==board[j][moves[i]-1]){
						stack.pop();
						board[j][moves[i]-1]=0;
						answer+=2;
						break;
					}else{
						stack.push(board[j][moves[i]-1]);
						board[j][moves[i]-1]=0;
						break;
					}
					
				}
					
			}
		}
		
        return answer;
    }

}
