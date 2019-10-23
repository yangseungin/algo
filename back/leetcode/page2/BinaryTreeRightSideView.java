package page2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(5);
		TreeNode t5 = new TreeNode(4);

		t1.left = t2;
		t1.right = t3;
		t1.left.right = t4;
		t1.right.right = t5;

		System.out.println(rightSideView(t1));
	}

	public static List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();

		if (root == null) {
			return result;
		}
		Queue<TreeNode> que = new LinkedList<>();
		que.add(root);

		while (!que.isEmpty()) {
			int size = que.size();
			for (int i = 0; i < size; i++) {
				TreeNode current = que.remove();
				if (i == size - 1) {
					result.add(current.val);
				}
				if (current.left != null) {
					que.add(current.left);
				}
				if (current.right != null) {
					que.add(current.right);
				}
			}
		}

		return result;
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
