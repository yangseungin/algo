package page2;

public class FlattenBinaryTreetoLinkedList {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);

		t1.left = t2;
		t1.left.left = t3;
		t1.left.right = t4;
		t1.right = t5;
		t1.right.right = t6;

		flatten(t1);
	}

	public static void flatten(TreeNode root) {
		if(root==null){
			return ;
		}
		System.out.println(root.val);
		
		if(root.left ==null){ 
			flatten(root.right);
			return;
		}
		if(root.right == null)
		{   
			root.right = root.left;
			root.left = null;
			flatten(root.right);
			return;
		}
		flatten(root.left);
		flatten(root.right);
		TreeNode node = root.left;

		while(node.right!=null){
			node = node.right;
		}
		node.right = root.right;
		root.right = root.left;
		root.left = null;
		
		return ;
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
