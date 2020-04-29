package day30challenge;

public class BinaryTreeMaximumPathSum {
	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(-10,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
		
		System.out.println(maxPathSum(t1));

	}

	public static int maxPathSum(TreeNode root) {
		int result = maxPath(root);

		return Math.max(result, max);
	}
	public static int maxPath(TreeNode root){
		if(root==null){
			return 0;
		}
		
		int left = maxPath(root.left);
		int right = maxPath(root.right);
		
		if(left<0){
			left=0;
		}
		if(right<0){
			right=0;
		}
		max = Math.max(max, root.val+left+right);
		
		return root.val + Math.max(left, right);
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}
