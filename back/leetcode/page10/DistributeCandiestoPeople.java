package page10;

import java.util.Arrays;

public class DistributeCandiestoPeople {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(distributeCandies(7, 4)));
	}

	public static int[] distributeCandies(int candies, int num_people) {
		int[] result = new int [num_people];
		int idx=1;
		while(idx<candies){
			result[(idx-1)%num_people] +=idx;
			candies-=idx;
			idx++;
		}
		result[(idx-1)%num_people] += candies;
		

		return result;
	}

}
