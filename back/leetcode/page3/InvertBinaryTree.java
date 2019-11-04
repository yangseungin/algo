package page3;

public class InvertBinaryTree {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(4);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(1);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(7);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(9);
		t1.left = t2;
		t1.left.left = t3;
		t1.left.right = t4;
		t1.right = t5;
		t1.right.left = t6;
		t1.right.right = t7;
		System.out.println(invertTree(t1).right.val);
	}

	public static TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		root.left = right;
		root.right = left;

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
