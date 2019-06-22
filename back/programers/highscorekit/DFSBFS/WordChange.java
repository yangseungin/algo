package highscorekit.DFSBFS;

public class WordChange {
	public static void main(String[] args) {
		System.out.println(solution("hit","cog",new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
	
		if(checkWord("bog","dog")){
			System.out.println("정답");
		}
	}
	
	public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        for(int i=0;i<words.length;i++){
        	 if(checkWord(begin, words[i]))
        		 dfs(words[i],target,words);
        }
        
        
        
        
        return answer;
    }
	public static int dfs(String begin, String target, String[] words){
		if(begin==target)
			return 1;
		// dfs재귀 구현
		
		
		return 0;
	}
	public static boolean checkWord(String begin,String target){
		int count=0;
		for(int i=0;i<begin.length();i++){
			if(begin.charAt(i)!=target.charAt(i))
				count++;
		}
		
		if(count==1)
			return true;
		else
			return false;	
	}
}
