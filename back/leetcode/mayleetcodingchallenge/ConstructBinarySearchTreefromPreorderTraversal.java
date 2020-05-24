package mayleetcodingchallenge;

public class ConstructBinarySearchTreefromPreorderTraversal {

	public static TreeNode bstFromPreorder(int[] preorder) {
		TreeNode root = null;
		for (int a : preorder) {
			root = insert(root, a);
		}
		return root;
	}

	public static TreeNode insert(TreeNode root, int a) {
		if (root == null) {
			return new TreeNode(a);
		} else if (a < root.val) {
			root.left = insert(root.left, a);
		} else {
			root.right = insert(root.right, a);
		}
		return root;
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
