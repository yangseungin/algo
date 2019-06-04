package highscorekit.hash;

public class NumberList {
	public static void main(String[] args) {
		System.out.println(solution(new String[]{"119","95375239","119535"}));
		System.out.println(solution(new String[]{"123","456","789"}));
		
	}
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int i=0;i<phone_book.length;i++){
        	for(int j=i+1;j<phone_book.length;j++){
        		if(phone_book[j].startsWith(phone_book[i]))
        			return false;
        	}
        }
        return answer;
    }

}
