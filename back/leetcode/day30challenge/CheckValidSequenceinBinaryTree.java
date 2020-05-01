package day30challenge;

public class CheckValidSequenceinBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0, new TreeNode(1, new TreeNode(0, null, new TreeNode(1)),
				new TreeNode(1, new TreeNode(0), new TreeNode(0))), new TreeNode(0, new TreeNode(1), null));
		int[] arr = new int[] { 0, 1, 0, 1 };
		System.out.println(isValidSequence(root, arr));

	}

	public static boolean isValidSequence(TreeNode root, int[] arr) {
		if (root == null) {
			return arr.length == 0;
		}

		return isValid(root, arr, 0);
	}

	public static boolean isValid(TreeNode node, int[] arr, int i) {
		if (node.val != arr[i]) {
			return false;
		}
		if (i == arr.length - 1) {
			return node.left == null && node.right == null;
		}
		if (node.left != null && isValid(node.left, arr, i + 1)) {
			return true;
		}
		if (node.right != null && isValid(node.right, arr, i + 1)) {
			return true;
		}

		return false;
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
