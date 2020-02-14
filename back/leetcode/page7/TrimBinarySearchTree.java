package page7;

public class TrimBinarySearchTree {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left=new TreeNode(0);
		t1.right = new TreeNode(2);
		
		TreeNode result = trimBST(t1, 1, 2);
		System.out.println(result.val);
	}
	public static TreeNode trimBST(TreeNode root, int L, int R){
		if (root == null) return root;
        if (root.val > R) return trimBST(root.left, L, R);
        if (root.val < L) return trimBST(root.right, L, R);

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
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
