package page6;

import java.util.List;

public class MaximumDepthTree {
	public static void main(String[] args) {

	}

	public static int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		List<Node> child = root.children;
		int s = 0;
		for (int i = 0; i < child.size(); i++) {
			s = Math.max(maxDepth(child.get(i)), s);
		}
		return s + 1;
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
