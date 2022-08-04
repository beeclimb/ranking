package github.beeclimb.binarytree;

/**
 * @author jun.ma
 * @date 2022/8/4 22:27
 * @leetcode 112. Path Sum
 */
public class PathSum_112 {

    public class TreeNode {
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

    public static boolean isSum = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        isSum = false;
        process(root, 0, targetSum);
        return isSum;
    }

    public void process(TreeNode root, int preSum, int targetSum) {
        // root为叶子节点
        if (root.left == null && root.right == null) {
            if (preSum + root.val == targetSum) {
                isSum = true;
            }
        }
        preSum += root.val;
        // root非叶子节点
        if (root.left != null) {
            process(root.left, preSum, targetSum);
        }
        if (root.right != null) {
            process(root.right, preSum, targetSum);
        }
    }
}
