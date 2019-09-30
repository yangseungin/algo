package page1;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
	public static void main(String[] args) {
		System.out.println(solveNQueens(4));

	}
	// input: 4

	// result:
	// [".Q..", // Solution 1
	// "...Q",
	// "Q...",
	// "..Q."],
	//
	// ["..Q.", // Solution 2
	// "Q...",
	// "...Q",
	// ".Q.."]
	// ]
	public static List<List<String>> solveNQueens(int n) {
		List<List<String>> result = new ArrayList<List<String>>();

		List<String> queen = new ArrayList<>();

		solution(n, 0, result, queen);
		return result;
	}
	public static void solution(int n,int row, List<List<String>> result, List<String> queen){
	
		
		
	}

}
