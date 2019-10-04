package page2;

public class ConvertSortedArraytoBinarySearchTree {
	public static void main(String[] args) {
		sortedArrayToBST(new int[] { -10, -3, 0, 5, 9 });

	}

	public static TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}

		return bstRecursive(nums, 0, nums.length - 1);
	}

	private static TreeNode bstRecursive(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}
		int mid = left + (right - left) / 2;
		TreeNode currentNode = new TreeNode(nums[mid]);
		currentNode.left = bstRecursive(nums, left, mid - 1);
		currentNode.right = bstRecursive(nums, mid + 1, right);

		return currentNode;
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
