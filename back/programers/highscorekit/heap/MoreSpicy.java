package highscorekit.heap;

import java.util.PriorityQueue;

public class MoreSpicy {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,3,9,10,12},7));
		
	}
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        for(int i=0;i<scoville.length;i++){
        	que.add(scoville[i]);
        }
        System.out.println(que);
        
        while(que.peek()<K){
        	if(que.size()<2)
        		return -1;
        	int num1=que.poll();
        	int num2=que.poll();
        	System.out.println(num1+" / "+num2);
        	que.add(num1+num2*2);
        	answer++;

            System.out.println(que);
        }
        
        
        
        
        
        
        return answer;
    }

}
