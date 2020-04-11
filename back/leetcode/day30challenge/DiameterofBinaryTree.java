package day30challenge;

public class DiameterofBinaryTree {
	int ans;

	public int diameterOfBinaryTree(TreeNode root) {
		ans = 1;
		getDepth(root);
		return ans - 1;
	}

	public int getDepth(TreeNode node) {
		if (node == null)
			return 0;
		int L = getDepth(node.left);
		int R = getDepth(node.right);
		ans = Math.max(ans, L + R + 1);
		return Math.max(L, R) + 1;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
