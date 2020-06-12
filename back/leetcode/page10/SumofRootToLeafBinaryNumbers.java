package page10;

public class SumofRootToLeafBinaryNumbers {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1, new TreeNode(0, new TreeNode(0), new TreeNode(1)),
				new TreeNode(1, new TreeNode(0), new TreeNode(1)));
		System.out.println(sumRootToLeaf(t1));

	}

	public static int sumRootToLeaf(TreeNode root) {
		return dfs(root, 0);
	}

	public static int dfs(TreeNode root, int val) {
		if (root == null){
			return 0;
		}
		val = val * 2 + root.val;
		if (root.left == null && root.right == null)
			return val;
		return dfs(root.left, val) + dfs(root.right, val);
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
