package page2;

public class BalancedBinaryTree {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(7);
		TreeNode t6 = new TreeNode(7);

		t1.left = t2;
		t1.right = t3;
		t1.right.left = t4;
		t1.right.right = t5;
		t1.right.right.left=t6;

		System.out.println(isBalanced(t1));
	}

	public static boolean isBalanced(TreeNode root) {
		
		return calDepth(root)!=-1?true:false;
	}

	public static int calDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int left = calDepth(root.left);
		int right = calDepth(root.right);

		if (left == -1 || right == -1)
			return -1;

		if (Math.abs(left - right) > 1) {
			return -1;
		}

		return Math.max(left, right) + 1;

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
