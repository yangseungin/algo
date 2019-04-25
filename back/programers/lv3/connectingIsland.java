package lv3;

import java.util.Arrays;
import java.util.Comparator;

public class connectingIsland {
	public static void main(String[] args) {

		// 음 이문제는 연결정보 넣고 시작점에서 짧은거리 이동하면서 값더하면 될것같
		// 그리디라 적혀있으니 최소신장트리로 프림이나 크루스칼 알고리즘으로 풀어보자

		int[][] arr = { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } };
		int n=4;

		System.out.println(solution(n, arr));

	}

	public static int solution(int n, int[][] costs) {
		int answer = 0;
		int[][] arr = new int[n][n];
		
		//일단 costs 오름차순으로 정
		Arrays.sort(costs,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[2]-o2[2];
			}
		});
		//소팅결과확
		for(int i=0;i<costs.length;i++){
			System.out.println(costs[i][0]+" / "+costs[i][1]+" / "+costs[i][2]);
		}
		for(int i=0;i<costs.length;i++){
			int start=costs[i][0];
			int end= costs[i][1];
			int cost= costs[i][2];

			arr[start][end]=cost;
			arr[end][start]=cost;
			
		}
		boolean[] checked=new boolean[n];
		System.out.println("--------------");
		
		
		
/*		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
			
		}
		
		for(int i=0;i<costs.length;i++){
			for(int j=0;j<n-1;j++){
				
				
			}
			answer+=costs[i][2];
			
			
		}
*/		
		
		
		
		return answer;
	}
	

}
