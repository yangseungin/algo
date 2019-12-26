package page6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NarrTreePreorderTraversal {
	public static void main(String[] args) {
		
	}
	  public static List<Integer> preorder(Node root) {
		  List<Integer> ans = new ArrayList<>();
	        if(root==null)
	            return ans;
	        Stack<Node> s = new Stack<>();
	        s.push(root);
	        while(!s.isEmpty()){
	            Node n = s.pop();
	            ans.add(n.val);
	            for (int i = n.children.size(); i-- > 0; ) {
	                s.push(n.children.get(i));
	                
	            }
	        }
	        return ans;
	    }

	static class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	};
}
