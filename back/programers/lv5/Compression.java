package lv5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Compression {
	public static void main(String[] args) {
		//System.out.println(solution("KAKAO"));
		System.out.println(solution("TOBEORNOTTOBEORTOBEORNOT"));
		//System.out.println(solution("ABABABABABABABAB"));

	}

	public static int[] solution(String msg) {
		Map map = new HashMap<Integer,String>();
		ArrayList list = new ArrayList<String>();
		char alpha='A';
		int index=1;
		//기본 알파벳 추
		for(;index<=26;index++,alpha++){
			map.put(Character.toString(alpha),index);	
		}

		alpha='A';
		for(int i=1;i<=26;i++,alpha++){
			System.out.println(map.get(Character.toString(alpha)));
		}
		
		
		// msg가 다사라지지않았으면 
		while(msg.length()!=0){
			//전체탐색하면서 포함하는 가장긴 단어찾고 출력하고  그다음글자가 있으면 붙여서 사전에 추가 
			for(int i=msg.length(); i>0; i--){
				System.out.println(msg.substring(0,i));
				//가장긴게있는지부터 확
				if(map.containsKey(msg.substring(0,i))){	
					System.out.println("찾음");
					String key = msg.substring(0,i);
					String nextKey="";
					list.add(map.get(key));
					
					//남은 문자가 있으면 
					if(msg.length()>i+1){
						nextKey=key+msg.substring(i,i+1);
						//사전에 없으면 추가
						if(!map.containsKey(nextKey)){
							System.out.println(nextKey);
							map.put(nextKey,index);
							index++;
						}
						
					}				
					msg=msg.substring(key.length());
					break;					
				}
			}
		}
		
		System.out.println(list.toString());
		
		

		
		
		
		
		int[] answer = new int[list.size()];
		for(int i=0;i<list.size();i++){
			answer[i]=(int) list.get(i);
		}

		return answer;
	}

}
