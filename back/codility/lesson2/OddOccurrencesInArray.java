package lesson2;

import java.util.HashSet;
import java.util.Iterator;

public class OddOccurrencesInArray {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{9,3,9,3,9,7,9}));

	}

	public static int solution(int[] A) {
		HashSet<Integer> hashSet = new HashSet<>();
		
		for(int i=0;i<A.length;i++){
			if(!hashSet.contains(A[i])){
				hashSet.add(A[i]);
			}else{
				hashSet.remove(A[i]);
			}
			
		}
		
		Iterator it = hashSet.iterator();
		return (int)it.next();
	}

}
