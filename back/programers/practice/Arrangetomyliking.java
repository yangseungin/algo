package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrangetomyliking {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[]{"sun","bed","car"}, 1)));
	}
	public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> myArr = new ArrayList<>();
        
        for(int i=0; i<strings.length; ++i)
            myArr.add("" + strings[i].charAt(n) + strings[i]);
        
        Collections.sort(myArr);
        answer = new String[myArr.size()];
        
        for(int i=0; i<myArr.size(); ++i)
            answer[i] = myArr.get(i).substring(1, myArr.get(i).length());
        
        return answer;
    }

}
