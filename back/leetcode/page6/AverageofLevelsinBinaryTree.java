package page6;

import java.util.ArrayList;
import java.util.List;

public class AverageofLevelsinBinaryTree {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		t1.left = new TreeNode(9);
		t1.right = new TreeNode(20);
		t1.right.left = new TreeNode(15);
		t1.right.right = new TreeNode(7);

		List<Double> result = averageOfLevels(t1);
		System.out.println(result);
	}

	public static List<Double> averageOfLevels(TreeNode root) {
		List<Integer> count = new ArrayList<>();
		List<Double> result = new ArrayList<>();
		average(root, 0, result, count);
		for (int i = 0; i < result.size(); i++)
			result.set(i, result.get(i) / count.get(i));
		return result;

	}

	public static void average(TreeNode t, int i, List<Double> sum, List<Integer> count) {
		if (t == null)
			return;
		if (i < sum.size()) {
			sum.set(i, sum.get(i) + t.val);
			count.set(i, count.get(i) + 1);
		} else {
			sum.add(1.0 * t.val);
			count.add(1);
		}
		average(t.left, i + 1, sum, count);
		average(t.right, i + 1, sum, count);
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
