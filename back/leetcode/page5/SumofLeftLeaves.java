package page5;

public class SumofLeftLeaves {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(7);

		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;

		System.out.println(sumOfLeftLeaves(t1));

	}

	public static int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		} else if (root.left != null && root.left.left == null && root.left.right == null) {	// 왼쪽의 자식이없을때만 값을 더하고 다음 search
			return root.left.val + sumOfLeftLeaves(root.right);

		} else { 
			return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
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
