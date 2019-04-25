package lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class visitLength {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		/*
		 * (-5,-5)~(5,5) 배열 선언해서 지나간 선분 표시하면 될듯
		 * [x1][y1][x2][y2] , [x2][y2][x1][y1]둘다 표시(4차원배열이라) 저둘은 같음
		 * 
		 */
		String dirs = "LULLLLLLU";

		System.out.println(solution(dirs));

	}

	public static int solution(String dirs) {
		int answer = 0;
		int[][][] arr = new int[11][11][4];
		int len = dirs.length();
		int x=5,y=5;	//L= 0 R=1 U=2 D=3
		int count=0;

		for (int i = 0; i < len; i++) {
			switch (dirs.charAt(i)) {
			case 'L':
				if (x > 0) {
					if(arr[x][y][0]==0){
					count++;
					arr[x][y][0]=1;
					arr[--x][y][1]=1;
					}else{
						x--;
					}
					
				//	System.out.println("왼쪽");
				}
				break;
			case 'R':
				if (x < 10) {
					if(arr[x][y][1]==0){
						count++;
						arr[x][y][1]=1;
						arr[++x][y][0]=1;
					}else{
						x++;
					}
					
				//	System.out.println("오른쪽");
				}
				break;
			case 'U':
				if (y < 10) {
					if(arr[x][y][2]==0){
						count++;
						arr[x][y][2]=1;
						arr[x][++y][3]=1;
					}else{
						y++;
					}
					
					//System.out.println("위쪽");
				}
				break;
			case 'D':
				if (y > 0) {
					if(arr[x][y][3]==0){
						count++;
						arr[x][y][3]=1;
						arr[x][--y][2]=1;
					}else{
						y--;
					}
				//	System.out.println("아래쪽");
				}
				break;

			}
		}
		answer=count;

		return answer;
	}

}
