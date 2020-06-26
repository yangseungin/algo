package juneleetcodeingchallenge;

public class SumRoottoLeafNumbers {

	public int sumNumbers(TreeNode root) {
		if (root == null) {
			return 0;
		}

		return dfs(root, 0, 0);
	}

	public int dfs(TreeNode root, int num, int sum) {
		if (root == null) {
			return sum;
		}
		num = num * 10 + root.val;

		if (root.left == null && root.right == null) {
			sum += num;
			return sum;
		}
		sum = dfs(root.left, num, sum) + dfs(root.right, num, sum);

		return sum;
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
