package lv5;

public class RoomCount {
	static int numX=0;
	static int numY=0;
	
	public static void main(String[] args) {
		
	/*	그래프 음....
	 *	뭔가 돌다 다시 자기자리에왔을떄체크를 하면 될거 같은데 음..
	 	한번 간적있던 점에 방문하면 도형이 하나씩 추가됨 그러나 이동으로인해 그어진선이 기존에 있떤 선이면 안됨  오오.. 가능할삘인
	 	점과점사이를 쪼개어 반토막씩 내고 그가운데점이 체크되면 지나온선으로 해서 구하면 될거 같음 굿
	 * 	
		
		*/
		
		
		int[] arrows = {6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0, 1, 6, 5, 5, 3, 6, 0};
		
		System.out.println(solution(arrows));
		
		
	}	
	
	public static int solution(int[] arrows){
		int answer=0;
		for(int i=0;i<arrows.length;i++){
			move(arrows[i]);
		}
		
		
		System.out.println("x,y : "+numX+" , "+numY);
		
		
		
		
		return answer;
	}
	public static void move(int arrow){
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
		
		
	}

}
