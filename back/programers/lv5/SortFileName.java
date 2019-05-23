package lv5;

import java.util.Arrays;
import java.util.Comparator;

public class SortFileName {
	public static void main(String[] args) {
		String[] files = { "foo9.txt", "foo010bar020.zip", "F-15" };
		//System.out.println(solution(files));
		System.out.println(solution(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"}));

	}

	public static String[] solution(String[] files) {
		
		Arrays.sort(files, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String headO1 = o1.split("\\d")[0];
				o1=o1.replace(headO1, "");
				headO1=headO1.toUpperCase();
				
				String num1="";
				for(int i=0;i<o1.length();i++){
					if(Character.isDigit(o1.charAt(i))&&num1.length()<5)
						num1+=o1.charAt(i);
					else
						break;
				}
				
				String headO2 = o2.split("\\d")[0];
				o2=o2.replace(headO2, "");
				headO2=headO2.toUpperCase();
				String num2="";
				for(int i=0;i<o2.length();i++){
					if(Character.isDigit(o2.charAt(i))&&num2.length()<5)
						num2+=o2.charAt(i);
					else
						break;
				}
				if(headO1.equals(headO2))
					return Integer.parseInt(num1)-Integer.parseInt(num2);
				else
					return headO1.compareTo(headO2);
				
			}
		});
		
		for(int i=0;i<files.length;i++){
			System.out.println(files[i]);
		}
		
		return files;
	}

}
