package page1;

import java.util.ArrayList;
import java.util.List;

public class BInaryTreeInorderTraversal {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		t1.right = t2;
		t1.right.left = t3;

		System.out.println(inorderTraversal(t1));

	}

	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();

		middle(root,result);
		
		
		return result;

	}
	public static void  middle(TreeNode root , List<Integer> result){
		if(root==null){			
			return;
		}
		if(root.left!=null)
			middle(root.left,result);
		
		result.add(root.val);
		
		if(root.right!=null)
			middle(root.right,result);
		
		
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
