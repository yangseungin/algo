package lv5;

import java.util.Arrays;

public class RoomCount2 {
	static int numX=0;
	static int numY=0;
	
	public static void main(String[] args) {
		
	/*	그래프 음....
	 * 	크기 두배로해서 가운데점을 선분이동용으로 체크해봐야겠다.. 근데 이러면 백프로 메모리초과로 에러날거
		
		*/
		
		
		int[] arrows = {6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0, 1, 6, 5, 5, 3, 6, 0};
		
		System.out.println(solution(arrows));
		
		
	}	
	
	public static int solution(int[] arrows){
		int answer=0;
		int[] direction=new int[8];
		
		for(int i=0;i<arrows.length;i++){
			direction[arrows[i]]++;
		}
		for(int i=0;i<8;i++){
			System.out.println(direction[i]);
		}
		
		int maxHeight=(direction[0]+direction[1]+direction[7])*2;
		int maxLow=(direction[3]+direction[4]+direction[5])*2; 
		int maxRight=(direction[1]+direction[2]+direction[3])*2;
		int maxLeft=(direction[5]+direction[6]+direction[7])*2;
		
		System.out.println(maxHeight+" / "+maxLow+" / "+maxRight+" / "+maxLeft);
		int[][] location = new int [maxHeight+maxLow+2][maxRight+maxLeft+2];
		numX=maxLeft;
		numY=maxLow;
		
		
		
		System.out.println(numX+"     /      "+numY);
		
		//시작
		location[numY][numX]=4;
		
		//움직임
		for(int i=0;i<arrows.length;i++){
			move(arrows[i],location);
			//print(maxHeight,maxLow,maxRight,maxLeft,location,arrows[i]);
		}
		//이전에 방문한적이 있는선분이란걸 체크하는걸 넣어야함.
		
	/*	for(int i=maxHeight+maxLow;i>0;i--){
			for(int j=0;j<maxLeft+maxRight;j++){
				System.out.print(location[j][i]+" ");
				if(location[i][j]>1)
					answer++;
			}
			System.out.println();
		}*/
		for(int i=location.length-1;i>=0;i-=2){
			for(int j=0;j<location[0].length;j+=2){
				System.out.print(location[i][j]+" ");
				if(location[i][j]>1)
					answer++;
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("x,y : "+numX+" , "+numY);
		
		
		
		
		return answer;
	}
	public static void print(int maxHeight,int maxLow,int maxRight,int maxLeft, int[][] location,int input){
		
		for(int i=maxHeight+maxLow;i>0;i--){
			for(int j=0;j<maxLeft+maxRight;j++){
				System.out.print(location[j][i]+" ");
				//if(location[i][j]>1)
					//answer++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------------------------");
		
	}
	public static void move(int arrow,int[][] location){
		if(arrow==0){
			if(location[numY+1][numX]==0)
				location[numY+1][numX]=1;
			numY+=2;
		}else if(arrow==1){
			if(location[numY+1][numX+1]==0)
				location[numY+1][numX+1]=1;
			numX+=2;
			numY+=2;
		}else if(arrow==2){
			if(location[numY][numX+1]==0)
				location[numY][numX+1]=1;
			numX+=2;
		}else if(arrow==3){
			if(location[numY-1][numX+1]==0)
				location[numY-1][numX+1]=1;
			numX+=2;
			numY-=2;
		}else if(arrow==4){
			if(location[numY-1][numX]==0)
				location[numY-1][numX]=1;
			numY-=2;
		}else if(arrow==5){	
			if(location[numY-1][numX-1]==0)
				location[numY-1][numX-1]=1;
			numX-=2;
			numY-=2;
		}else if(arrow==6){
			if(location[numY][numX-1]==0)
				location[numY][numX-1]=1;
			numX-=2;
		}else if(arrow==7){
			if(location[numY+1][numX-1]==0)
				location[numY+1][numX-1]=1;
			numX-=2;
			numY+=2;
		}
		location[numY][numX]++;
		
		
	}

}
