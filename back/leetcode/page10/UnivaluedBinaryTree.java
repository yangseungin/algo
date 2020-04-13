package page10;

import java.util.ArrayList;
import java.util.List;

public class UnivaluedBinaryTree {
	static List<Integer> list;

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(1);
		t1.right = new TreeNode(1);
		t1.left.left = new TreeNode(1);
		t1.left.right = new TreeNode(1);
		System.out.println(isUnivalTree(t1));
	}

	public static boolean isUnivalTree(TreeNode root) {
		list = new ArrayList<>();
		dfs(root);
		for (int i : list) {
			if (i != list.get(0)) {
				return false;
			}

		}

		return true;
	}

	public static void dfs(TreeNode node) {
		if (node != null) {
			list.add(node.val);
			dfs(node.left);
			dfs(node.right);
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
