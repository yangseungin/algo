package page1;

public class ValidateBinarySearchTree {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(0);

		System.out.println(isValidBST(t1));

	}

	public static boolean isValidBST(TreeNode root) {

		return checkBST(root, Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);
	}

	public static boolean checkBST(TreeNode root, double min,double max) {
		if (root == null) {
			return true;
		}
		if(root.val<=min||root.val>=max){
			return false;
		}
		if(!checkBST(root.left, min, root.val)||!checkBST(root.right, root.val, max)){
			return false;
		}
		
		return true;
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
