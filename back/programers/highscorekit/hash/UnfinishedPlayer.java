package highscorekit.hash;

import java.util.Arrays;

public class UnfinishedPlayer {
	public static void main(String[] args) {
		
		System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
		
		
	}
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);

        String answer = "";
       
       for(int i=0;i<participant.length;i++){
    	   boolean flag=true;
    	   for(int j=0;j<completion.length;j++){
    		   if(participant[i].equals(completion[j])){
    			   flag=false;
    			   completion[j]=null;
    			   break;
    		   }
    		   
    	   }
    	   if(flag)
    		   return participant[i];
    	   
       }

        
        return answer;
    }

}
