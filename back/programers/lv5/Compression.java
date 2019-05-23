package lv5;

import java.util.HashMap;
import java.util.Map;

public class Compression {
	public static void main(String[] args) {
		System.out.println(solution("KAKAO"));
		//System.out.println(solution("TOBEORNOTTOBEORTOBEORNOT"));
		//System.out.println(solution("ABABABABABABABAB"));

	}

	public static int[] solution(String msg) {
		Map map = new HashMap<Integer,String>();
		char alpha='A';
		//기본 알파벳 추
		for(int i=1;i<=26;i++,alpha++){
			map.put(i,alpha);
		}
		
		// msg가 다사라지지않았으면 
		while(msg.length()!=0){
			//전체탐색하면서 포함하는 가장긴 단어찾고 출력하고  그다음글자가 있으면 붙여서 사전에 추가 
			for(int i=msg.length(); i>0; i++){
				
			}
			
		}
		
		

		
		
		
		
		int[] answer = {};
		

		return answer;
	}

}
