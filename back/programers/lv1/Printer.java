package lv1;

import java.util.LinkedList;

public class Printer {
	public static void main(String[] args) {
		int[] priorites={2,1,3,2};
		int location=2;
		System.out.println(solution(priorites,location));
	}
	
	public static class Document{
		int index;
		int priority;
		public Document(int index, int priority) {
			this.index = index;
			this.priority = priority;
		}
		
	}
	public static int solution(int[] priorties, int location){
		int answer=0;
		
		LinkedList<Document> list = new LinkedList<Document>();
		
		for(int i=0;i<priorties.length;i++){
			list.add(new Document(i,priorties[i]));
		}
		
		while(list.size()>1){
			for(int i=0;i<list.size();i++){
				
				
				
			}

			
		}
		
		
		
		
		
		return answer;
	}
}
