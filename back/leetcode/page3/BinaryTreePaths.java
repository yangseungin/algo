package page3;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	public static void main(String[] args) {

	}

	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<String>();

		if (root == null) {
			return result;
		}

		dfs(root, "", result);

		return result;
	}

	public static void dfs(TreeNode root, String str, List<String> result) {
		str += root.val;
		if (root.left == null && root.right == null) {
			result.add(str);
			return;
		}
		if (root.left != null) {
			dfs(root.left, str + "->", result);
		}
		if (root.right != null) {
			dfs(root.right, str + "->", result);
		}

	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
