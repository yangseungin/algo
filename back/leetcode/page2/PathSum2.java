package page2;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(4);
		TreeNode t3 = new TreeNode(8);
		TreeNode t4 = new TreeNode(11);
		TreeNode t5 = new TreeNode(13);
		TreeNode t6 = new TreeNode(4);
		TreeNode t7 = new TreeNode(7);
		TreeNode t8 = new TreeNode(2);
		TreeNode t9 = new TreeNode(5);
		TreeNode t10 = new TreeNode(1);

		t1.left = t2;
		t1.right = t3;
		t1.left.left = t4;
		t1.right.left = t5;
		t1.right.right = t6;
		t1.left.left.left = t7;
		t1.left.left.right = t8;
		t1.right.right.left = t9;
		t1.right.right.right = t10;

		System.out.println(pathSum(t1, 22));
	}

	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> sumList = new ArrayList<>();
		findPath(root, sum, sumList, result);
		return result;
	}

	public static void findPath(TreeNode root, int sum, List<Integer> sumList, List<List<Integer>> result) {
		if (root == null) {
			return;
		}
		sumList.add(root.val);
		if (root.left == null && root.right == null && sum - root.val == 0) {
			result.add(sumList);
			return;
		}

		findPath(root.left, sum - root.val, new ArrayList<Integer>(sumList), result);
		findPath(root.right, sum - root.val, new ArrayList<Integer>(sumList), result);

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
