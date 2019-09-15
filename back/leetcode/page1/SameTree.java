package page1;

public class SameTree {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t1l = new TreeNode(2);
		TreeNode t1r = new TreeNode(3);
		t1.left=t1l;
		t1.right=t1r;
		TreeNode t2 = new TreeNode(1);
		TreeNode t2l = new TreeNode(2);
		TreeNode t2r = new TreeNode(3);
		t2.left=t2l;
		t2.right=t2r;
		System.out.println(isSameTree(t1, t2));
		
		
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null&& q==null){
			return true;
		}
		
		if(p==null||q==null){
			return false;
		}
		
		
		if(p.val==q.val){
			return isSameTree(p.left, q.left)&& isSameTree(p.right, q.right);
			
		}else{
			return false;
		}
		

		
		
	}
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
