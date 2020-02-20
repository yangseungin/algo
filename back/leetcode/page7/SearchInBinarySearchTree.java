package page7;

import est.Q2.Tree;

public class SearchInBinarySearchTree {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(4);
		t1.left = new TreeNode(2);
		t1.right = new TreeNode(7);
		t1.left.left = new TreeNode(1);
		t1.left.right = new TreeNode(3);

		TreeNode result = searchBST(t1, 2);

	}

	public static TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
			return null;
		}
		if (root.val == val) {
			return root;
		} else if (root.val > val) {
			TreeNode tmp = searchBST(root.left, val);
			return tmp != null ? tmp : null;
		} else { // root.val<val
			TreeNode tmp = searchBST(root.right, val);
			return tmp != null ? tmp : null;
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
