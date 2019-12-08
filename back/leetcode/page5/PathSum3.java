package page5;

public class PathSum3 {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(10);
		TreeNode t2 = new TreeNode(5);
		TreeNode t3 = new TreeNode(-3);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(2);
		TreeNode t6 = new TreeNode(11);
		TreeNode t7 = new TreeNode(3);
		TreeNode t8 = new TreeNode(-2);
		TreeNode t9 = new TreeNode(1);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.right = t6;
		t4.left = t7;
		t4.right = t8;
		t6.right = t9;
		System.out.println(pathSum(t1, 8));
	}

	public static int pathSum(TreeNode root, int sum) {
		if (root == null)
			return 0;
		return cal(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	}

	public static int cal(TreeNode root, int rest) {
		if (root == null)
			return 0;
		int cur = 0;
		if (rest == root.val)
			cur = 1;
		cur += cal(root.left, rest - root.val);
		cur += cal(root.right, rest - root.val);
		return cur;
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
