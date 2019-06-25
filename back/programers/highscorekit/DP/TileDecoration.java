package highscorekit.DP;

public class TileDecoration {
	public static void main(String[] args) {
		System.out.println(solution(6));
	}
	public static long solution(int N){
		long answer=0;
		long[] fibo = new long[N+1];
		fibo[1]=1;
		
		for(int i=2;i<fibo.length;i++){
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		
		answer = fibo[N]*4+fibo[N-1]*2;
		return answer;
		
	}

}
