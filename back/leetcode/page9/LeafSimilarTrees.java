package page9;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		t1.left = new TreeNode(5);
		t1.right = new TreeNode(1);
		t1.left.left = new TreeNode(6);
		t1.left.right = new TreeNode(2);
		t1.left.right.left = new TreeNode(7);
		t1.left.right.right = new TreeNode(4);
		t1.right.left = new TreeNode(9);
		t1.right.right = new TreeNode(8);

		TreeNode t2 = new TreeNode(3);
		t2.left = new TreeNode(5);
		t2.right = new TreeNode(1);
		t2.left.left = new TreeNode(6);
		t2.left.right = new TreeNode(7);
		t2.right.left = new TreeNode(4);
		t2.right.right = new TreeNode(2);
		t2.right.right.left = new TreeNode(9);
		t2.right.right.right = new TreeNode(8);

		System.out.println(leafSimilar(t1, t2));


	}

	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		dfs(root1,list1);
		dfs(root2,list2);
		
		System.out.println(list1);
		System.out.println(list2);

		
		return list1.equals(list2);
	}

	public static void dfs(TreeNode node, List<Integer> list) {
		if (node != null) {
			if (node.left == null && node.right == null) {
				list.add(node.val);
			}
			dfs(node.left, list);
			dfs(node.right, list);
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
