package page6;

public class DiameterofBinaryTree {
	static int ans;
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		System.out.println(diameterOfBinaryTree(t1));
	}

	public static int diameterOfBinaryTree(TreeNode root) {
		ans = 1;
        getDepth(root);
        return ans - 1;
	}
	public static int getDepth(TreeNode node) {
        if (node == null) return 0;
        int L = getDepth(node.left);
        int R = getDepth(node.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L, R) + 1;
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
