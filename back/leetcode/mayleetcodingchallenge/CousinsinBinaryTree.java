package mayleetcodingchallenge;

public class CousinsinBinaryTree {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));

		System.out.println(isCousins(t1, 4, 3));

	}

	static TreeNode xParent = null;
	static TreeNode yParent = null;
	static int xDepth = -1, yDepth = -2;

	public static boolean isCousins(TreeNode root, int x, int y) {
		dfs(root, null, x, y, 0);
		return xDepth == yDepth && xParent != yParent;
	}

	public static void dfs(TreeNode root, TreeNode parent, int x, int y, int depth) {
		if (root == null)
			return;
		if (x == root.val) {
			xParent = parent;
			xDepth = depth;
		} else if (y == root.val) {
			yParent = parent;
			yDepth = depth;
		} else {
			dfs(root.left, root, x, y, depth + 1);
			dfs(root.right, root, x, y, depth + 1);
		}
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}
