package page2;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public static void main(String[] args) {
		System.out.println(generate(5));
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		if(numRows<=0){
			return result;
		}
		List<Integer> first = new ArrayList<>();
		first.add(1);
		result.add(first);
		
		for(int i=2;i<=numRows;i++){
			List<Integer> tmp = new ArrayList<>();
			tmp.add(1);
			for(int j=0;j<first.size()-1;j++){
				tmp.add(first.get(j)+first.get(j+1));
			}
			tmp.add(1);
			result.add(tmp);
			first=tmp;
		}

		
		
		return result;
	}

}
