package page5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class KeyboardRow {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
		System.out.println(Arrays.toString(findWords(new String[]{"asdfghjkl","qwertyuiop","zxcvbnm"})));
	}

	public static String[] findWords(String[] words) {
		Character r1[] = {'Q','W','E','R','T','Y','U','I','O','P','q','w','e','r','t','y','u','i','o','p'};
        Character r2[] = {'A','S','D','F','G','H','J','K','L','a','s','d','f','g','h','j','k','l'};
        Character r3[] = {'Z','X','C','V','B','N','M','z','x','c','v','b','n','m'};
        Set<Character> row1 = new HashSet<>(Arrays.asList(r1));
        Set<Character> row2 = new HashSet<>(Arrays.asList(r2));
        Set<Character> row3 = new HashSet<>(Arrays.asList(r3));
        
        List<String> res = new LinkedList<>();
        int idx = 0;
        for(String word:words){
            if(row1.contains(word.charAt(0))) idx =1;
            if(row2.contains(word.charAt(0))) idx =2;
            if(row3.contains(word.charAt(0))) idx =3;
            for(int i = 1; i < word.length(); i++){
                if(idx ==1){
                    if(!row1.contains(word.charAt(i))){
                    	idx = -1;
                        break;
                    }
                }
                else if(idx ==2){
                	if(!row2.contains(word.charAt(i))){
                    	idx = -1;
                        break;
                    }
                }
                else if(idx ==3){
                	if(!row3.contains(word.charAt(i))){
                    	idx = -1;
                        break;
                    }
                }
            }
            if(idx != -1){
                res.add(word);
            }
        }
        String[] result = new String[res.size()];
        result = res.toArray(result);
        return result;
	}

}
