package lv5;

import java.util.Arrays;

public class RoomCount {
	static int numX=0;
	static int numY=0;
	
	public static void main(String[] args) {
		
	/*	그래프 음....
	 *	뭔가 돌다 다시 자기자리에왔을떄체크를 하면 될거 같은데 음..
	 	한번 간적있던 점에 방문하면 도형이 하나씩 추가됨 그러나 이동으로인해 그어진선이 기존에 있떤 선이면 안됨  오오.. 가능할삘인
	 	점과점사이를 쪼개어 반토막씩 내고 그가운데점이 체크되면 지나온선으로 해서 구하면 될거 같음 굿
	 	
	 	기존에 방문했던점에서 방문했떤점으로 이동인지도 체크해야함
	 	메모리 초 런타임에러 나는경우도있어서 용량처리를 어케해야할지 수정해야
	 * 	
		
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
		
		int maxHeight=direction[0]+direction[1]+direction[7];
		int maxLow=direction[3]+direction[4]+direction[5];
		int maxRight=direction[1]+direction[2]+direction[3];
		int maxLeft=direction[5]+direction[6]+direction[7];
		
		System.out.println(maxHeight+" / "+maxLow+" / "+maxRight+" / "+maxLeft);
		int[][] location = new int [maxRight+maxLeft+1][maxHeight+maxLow+1];
		numX=maxLeft;
		numY=maxLow;
		
		
		
		System.out.println(numX+"     /      "+numY);
		
		//시작
		location[numX][numY]=4;
		
		//움직임
		for(int i=0;i<arrows.length;i++){
			move(arrows[i],location);
			//print(maxHeight,maxLow,maxRight,maxLeft,location,answer);
		}
		
		
		for(int i=maxHeight+maxLow;i>0;i--){
			for(int j=0;j<maxLeft+maxRight;j++){
				System.out.print(location[j][i]+" ");
				if(location[i][j]>1)
					answer++;
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("x,y : "+numX+" , "+numY);
		
		
		
		
		return answer;
	}
	public static void print(int maxHeight,int maxLow,int maxRight,int maxLeft, int[][] location,int answer){
		
		for(int i=maxHeight+maxLow;i>0;i--){
			for(int j=0;j<maxLeft+maxRight;j++){
				System.out.print(location[j][i]+" ");
				if(location[i][j]>1)
					answer++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------------------------");
		
	}
	public static void move(int arrow,int[][] location){
		if(arrow==0){
			numY++;
		}else if(arrow==1){
			numX++;
			numY++;
		}else if(arrow==2){
			numX++;
		}else if(arrow==3){
			numX++;
			numY--;
		}else if(arrow==4){
			numY--;
		}else if(arrow==5){	
			numX--;
			numY--;
		}else if(arrow==6){
			numX--;
		}else if(arrow==7){
			numX--;
			numY++;
		}
		location[numX][numY]++;
		
		
	}

}
