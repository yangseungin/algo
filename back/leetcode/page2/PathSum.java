package page2;

public class PathSum {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(4);
		TreeNode t3 = new TreeNode(8);
		TreeNode t4 = new TreeNode(11);
		TreeNode t5 = new TreeNode(13);
		TreeNode t6 = new TreeNode(4);
		TreeNode t7 = new TreeNode(7);
		TreeNode t8 = new TreeNode(2);
		TreeNode t9 = new TreeNode(1);

		t1.left = t2;
		t1.right = t3;
		t1.left.left = t4;
		t1.right.left = t5;
		t1.right.right = t6;
		t1.left.left.left = t7;
		t1.left.left.right = t8;
		t1.right.right.right = t9;

		System.out.println(hasPathSum(t1, 22));
	}

	public static boolean hasPathSum(TreeNode root, int sum) {

		if (root == null) {
			return false;
		} else if (root.left == null && root.right == null && sum - root.val == 0) {
			return true;
		} else {
			return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
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
