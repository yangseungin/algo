package stack;

import java.util.Scanner;
public class Back10799 {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		System.out.println(solution(sc.nextLine()));
		
		
		
		
	}
	public static int solution(String arrangement){
		int answer=0;
		arrangement=arrangement.replace("()", "|");
		int count=0;
		for(int i=0;i<arrangement.length();i++){
			if(arrangement.charAt(i)=='(')
				count++;
			else if(arrangement.charAt(i)==')'){
				count--;
				answer++;
			}else
				answer+=count;	
		}
		return answer;		
	}

}

