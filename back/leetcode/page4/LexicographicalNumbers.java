package page4;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
	public static void main(String[] args) {
		lexicalOrder(13);

	}

	public static List<Integer> lexicalOrder(int n) {

		List<Integer> result = new ArrayList<>();
		dfs(result, n, 1);

		System.out.println(result);
		return result;
	}

	private static void dfs(List<Integer> res, int n, int cur) {
		if (cur > n) {
			return;
		}
		res.add(cur);
		dfs(res, n, cur * 10);
		
		if (cur % 10 < 9) {
			dfs(res, n, cur + 1);
		}
	}

}
