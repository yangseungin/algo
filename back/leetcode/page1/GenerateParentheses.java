package page1;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));

	}

	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();

		dfs(list, "", n, n);

		return list;

	}

	public static void dfs(List<String> list, String str, int left, int right) {
		if (left > right) {
			return;
		}

		if (left == 0 && right == 0) {
			list.add(str);
			return;
		}

		if (left > 0) {
			dfs(list, str + "(", left - 1, right);
		}
		if (right > 0) {
			dfs(list, str + ")", left, right - 1);
		}

	}

}
