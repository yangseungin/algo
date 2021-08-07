package challenge.Aug;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null)
                , new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));

        System.out.println(pathSum(t1, 22));
    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findPath(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    public static void findPath(TreeNode root, int sum, List<Integer> sumList, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        sumList.add(root.val);
        if (root.left == null && root.right == null && sum - root.val == 0) {
            result.add(sumList);
            return;
        }

        findPath(root.left, sum - root.val, new ArrayList<>(sumList), result);
        findPath(root.right, sum - root.val, new ArrayList<>(sumList), result);
    }

}

class TreeNode {
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
