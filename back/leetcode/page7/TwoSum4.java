package page7;

import java.util.HashSet;
import java.util.Set;

public class TwoSum4 {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(5);
		t1.left = new TreeNode(3);
		t1.right = new TreeNode(6);
		t1.left.left = new TreeNode(2);
		t1.left.right = new TreeNode(4);
		t1.right.right = new TreeNode(7);
		System.out.println(findTarget(t1, 2));
	}

	public static boolean findTarget(TreeNode root, int target) {
		Set<Integer> set = new HashSet<>();
		return find(root, target, set);
	}

	public static boolean find(TreeNode root, int target, Set<Integer> set) {
		if (root == null)
			return false;
		if (set.contains(target - root.val))
			return true;
		set.add(root.val);
		return find(root.left, target, set) || find(root.right, target, set);

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
