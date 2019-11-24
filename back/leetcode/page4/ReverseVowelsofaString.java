package page4;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsofaString {
	public static void main(String[] args) {
		System.out.println(reverseVowels("hello"));

	}

	public static String reverseVowels(String s) {
		char result[] = s.toCharArray(), tmp;
		List<Character> list = new ArrayList<>(); 
		list.add('a');		list.add('e');		list.add('i');		list.add('o');		list.add('u');
		list.add('A');		list.add('E');		list.add('I');		list.add('O');		list.add('U');
		int i = 0, j = result.length - 1;
		while (i < j) {
			if(!list.contains(result[i])){
				i++;
				continue;
			}
			if(!list.contains(result[j])){
				j--;
				continue;
			}
			
			tmp = result[i];
			result[i] = result[j];
			result[j] = tmp;
			i++;
			j--;
		}
		return new String(result);

		
	}

}
