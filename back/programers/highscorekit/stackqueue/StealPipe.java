package highscorekit.stackqueue;

public class StealPipe {
	public static void main(String[] args) {
		
		System.out.println(solution("()(((()())(())()))(())"));
		
		
		
		
	}
	public static int solution(String arrangement){
		int answer=0;
		arrangement=arrangement.replace("()", "|");
		System.out.println(arrangement);
		int count=0;
		for(int i=0;i<arrangement.length();i++){
			if(arrangement.charAt(i)=='(')
				count++;
			else if(arrangement.charAt(i)==')'){
				count--;
				answer++;
			}else{
				answer+=count;
			}
				
			
			
		}
		
		
		
		return answer;		
	}

}
