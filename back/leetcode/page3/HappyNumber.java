package page3;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappy(2));
	}

	public static boolean isHappy(int n) {
		System.out.println(getNumber(n));
		List<Integer> list = new ArrayList<>();
		list.add(n);
		while(getNumber(n)!=1){
			n=getNumber(n);
			
			if(list.contains(n)){
				return false;
			}
			
			list.add(n);
		}
		
		
		return true;
	}
	public static int getNumber(int n){
		String strNum=Integer.toString(n);
		int tmp=0;
		for(int i=0;i<strNum.length();i++){
			tmp+=Math.pow(strNum.charAt(i)-'0',2);
		}
		
		return tmp;
	}
	
}
