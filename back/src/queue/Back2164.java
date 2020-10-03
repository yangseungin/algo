package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<Integer>();
		// ArrayList로 풀었더니 시간초과나서 que로 
		int num= sc.nextInt();
		
		for(int i=1;i<=num;i++){
			que.offer(i);
		}
		
		
		
		while(que.size()>1){
			que.poll();
			que.offer(que.poll());
			
		}
		System.out.println(que.peek());
		
	}

}
