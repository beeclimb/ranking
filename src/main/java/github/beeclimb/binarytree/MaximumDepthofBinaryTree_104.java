package github.beeclimb.binarytree;

/**
 * @author jun.ma
 * @date 2022/8/1 8:38
 * @leetcode 104. Maximum Depth of Binary Tree
 */
public class MaximumDepthofBinaryTree_104 {

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

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }
}
