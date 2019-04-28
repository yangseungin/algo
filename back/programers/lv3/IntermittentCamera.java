package lv3;

import java.util.Arrays;
import java.util.Comparator;

public class IntermittentCamera {
	public static void main(String[] args) {

		int[][] routes = { { -20, 15 }, { -14, -5 }, { -18, -13 }, { -5, -3 } };

		System.out.println(solution(routes));
	}

	public static int solution(int[][] routes) {
		int answer = 1;

		Arrays.sort(routes, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[1] - o2[1];
			}
		});
/*
		for (int i = 0; i < routes.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(routes[i][j] + " ");

			}
			System.out.println();

		}*/

		int endpoint = routes[0][1];

		for (int i = 0; i < routes.length; i++) {
			int start = routes[i][0];
			int end = routes[i][1];
			if (endpoint < start  || endpoint > end) {
				endpoint=end;
				answer++;
			}

		}


		return answer;

	}

}
