package page2;

public class MaximunDepthofBinaryTree {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(7);
		t1.left = t2;
		t1.right = t3;
		t1.right.left = t4;
		t1.right.right = t5;

		System.out.println(maxDepth(t1));

	}

	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int lDept = maxDepth(root.left);
			int rDept = maxDepth(root.right);

			if (lDept > rDept) {
				return lDept + 1;
			} else {
				return rDept + 1;
			}
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
