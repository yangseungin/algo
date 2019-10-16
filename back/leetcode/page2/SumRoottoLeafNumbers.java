package page2;

public class SumRoottoLeafNumbers {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);

		t1.left = t2;
		t1.right = t3;

		System.out.println(sumNumbers(t1));
	}

	public static int sumNumbers(TreeNode root) {
		if (root == null) {
			return 0;
		}

		return dfs(root, 0, 0);

	}

	public static int dfs(TreeNode root, int num, int sum) {
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

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
