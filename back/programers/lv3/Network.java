package lv3;

public class Network {
	static int[] endPoint = new int[200];
	
	public static void main(String[] args) {
	
		int n=3;
		int[][] compusters = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		System.out.println(solution(n,compusters));
		
	}
	static int find(int n){
		if(n ==endPoint[n])
			return n;
		else
			return endPoint[n]=find(endPoint[n]);	
	}
	public static int solution(int n, int[][] computers){
		int answer =0;
		
		
		for(int i=0;i<n;i++){
			
		}
		
		
		
		return answer;
	}
	

}
