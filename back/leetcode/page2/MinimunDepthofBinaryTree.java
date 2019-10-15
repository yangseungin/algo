package page2;

public class MinimunDepthofBinaryTree {
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
		System.out.println(minDepth(t1));

	}

	public static int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return findDepth(root, 1);
	}

	public static int findDepth(TreeNode root, int len) {
		if (root.left == null && root.right == null) {
			return len;
		} else if (root.left != null && root.right == null) {
			return findDepth(root.left, len + 1);
		} else if (root.left == null && root.right != null) {
			return findDepth(root.right, len + 1);
		} else {
			int left = findDepth(root.left, len + 1);
			int right = findDepth(root.right, len + 1);
			return left < right ? left : right;
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
