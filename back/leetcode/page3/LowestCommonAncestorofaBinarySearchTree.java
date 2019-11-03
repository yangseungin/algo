package page3;

public class LowestCommonAncestorofaBinarySearchTree {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(6);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(0);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(3);
		TreeNode t6 = new TreeNode(5);
		TreeNode t7 = new TreeNode(8);
		TreeNode t8 = new TreeNode(7);
		TreeNode t9 = new TreeNode(9);
		t1.left=t2;
		t1.left.left=t3;
		t1.left.right=t4;
		t1.left.right.left=t5;
		t1.left.right.right=t6;
		t1.right=t7;
		t1.right.left=t8;
		t1.right.right=t9;
		
		System.out.println(lowestCommonAncestor(t1, t2, t7));
	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode t1 = new TreeNode(1);
		
		
		
		return t1;
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
