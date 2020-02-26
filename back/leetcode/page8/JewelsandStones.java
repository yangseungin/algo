package page8;

import java.util.HashSet;

public class JewelsandStones {
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));
	}

	public static int numJewelsInStones(String J, String S) {
		HashSet<Character> set = new HashSet<>();
		for(char c: J.toCharArray()){
			set.add(c); 
		}
		int result=0;
		for(char c: S.toCharArray()){
			if(set.contains(c)){
				result++;
			}
		}
		return result;
	}

}
