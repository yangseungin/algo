package page2;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
	public static void main(String[] args) {
		System.out.println(getRow(0));
	}

	public static List<Integer> getRow(int rowIndex) {
		List<List<Integer>> cal = new ArrayList<>();
		List<Integer> first = new ArrayList<>();
		
		first.add(1);
		
		if(rowIndex<=0){
			return first;
		}
		
		cal.add(first);
		
		for(int i=2;i<=rowIndex+1;i++){
			List<Integer> tmp = new ArrayList<>();
			tmp.add(1);
			for(int j=0;j<first.size()-1;j++){
				tmp.add(first.get(j)+first.get(j+1));
			}
			tmp.add(1);
			cal.add(tmp);
			first=tmp;
		}
		
		
		return first;
	}

}
