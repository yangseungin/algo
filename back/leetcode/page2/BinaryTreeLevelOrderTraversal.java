package page2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

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
		System.out.println(levelOrder(t1));
		

		

	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();

		if (root == null) {
			return result;
		}
		LinkedList<TreeNode> current = new LinkedList<>();
		LinkedList<TreeNode> next = new LinkedList<>();

		current.offer(root);
		List<Integer> list = new ArrayList<>();

		while (!current.isEmpty()) {
			TreeNode tmp = current.poll();

			list.add(tmp.val);

			if (tmp.left != null) {
				next.offer(tmp.left);
			}
			if (tmp.right != null) {
				next.offer(tmp.right);
			}

			if (current.isEmpty()) {
				current = next;
				next=new LinkedList<>();
				result.add(list);
				list = new ArrayList<>();
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
