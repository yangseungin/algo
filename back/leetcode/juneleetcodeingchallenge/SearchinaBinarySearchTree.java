package juneleetcodeingchallenge;

public class SearchinaBinarySearchTree {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
		searchBST(t1, 2);
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
