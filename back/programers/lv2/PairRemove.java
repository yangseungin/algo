package lv2;

import java.util.ArrayList;
import java.util.List;

public class PairRemove {
	public static void main(String[] args) {
		
		String str="baabaa";
		
		System.out.println(solution(str));
		
		
	}
	public static int solution(String str){
		int answer=0;
		
		List<Character> list = new ArrayList<>();
		char[]	cArr=str.toCharArray();
		
		for(int i=0;i<cArr.length;i++){
			list.add(cArr[i]);			//리스트에 하나씩넣으면
			
			if(list.size()>1 && list.get(list.size()-1)==list.get(list.size()-2)){	// 맨끝의 두개가 같으면 제
				
				list.remove(list.size()-1);
				list.remove(list.size()-1);
				
			}
			
			
		}
		// 리스트가 비어있으면 제거완료 아니면 0
		if(list.isEmpty())
			return 1;
		else
			return 0;
		
		
		
	}

}
