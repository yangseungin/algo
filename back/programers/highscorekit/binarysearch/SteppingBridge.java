package highscorekit.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;

public class SteppingBridge {
	public static void main(String[] args) {
		System.out.println(solution(25, new int[] { 2, 14, 11, 21, 17 }, 2));

	}

	public static int solution(int distance, int[] rocks, int n) {
		int index=0;
		Arrays.sort(rocks);
		System.out.println(Arrays.toString(rocks));
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int temp : rocks) {
			list.add(temp);
		}

		int min = Integer.MAX_VALUE;
		int start = 0;

		while (n != 0) {
			start=0;
			min=Integer.MAX_VALUE;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) - start < min) {
					min = list.get(i) - start;
					start = list.get(i);
					index=i;
				}
			
			}
			if (distance - list.get(list.size()-1) < min) {
				min = distance - list.get(list.size()-1);
				start = list.get(list.size()-1);
				index=list.size()-1;
			}

			list.remove(index);
			n--;

		}
		min=Integer.MAX_VALUE;
		start=0;
		for(int i=0;i<list.size();i++){
			if(list.get(i)-start<min){
				min=list.get(i)-start;
				start=list.get(i);
				
			}
		}
		return min;
	}

}
