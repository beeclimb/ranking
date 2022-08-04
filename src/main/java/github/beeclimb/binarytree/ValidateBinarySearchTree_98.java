package github.beeclimb.binarytree;

/**
 * @author jun.ma
 * @date 2022/8/4 21:30
 * @leetcode 98. Validate Binary Search Tree
 */
public class ValidateBinarySearchTree_98 {

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

    public class Info {
        boolean isBST;
        int max;
        int min;

        public Info(boolean isBST, int max, int min) {
            this.isBST = isBST;
            this.max = max;
            this.min = min;
        }
    }

    public Info process(TreeNode root) {
        if (root == null) {
            return null;
        }
        Info leftInfo = process(root.left);
        Info rightInfo = process(root.right);

        int max = root.val;
        int min = root.val;
        boolean isBST = true;

        if (leftInfo != null) {
            max = Math.max(max, leftInfo.max);
            min = Math.min(min, leftInfo.min);
        }
        if (rightInfo != null) {
            max = Math.max(max, rightInfo.max);
            min = Math.min(min, rightInfo.min);
        }
        if (leftInfo != null && !leftInfo.isBST) {
            isBST = false;
        }
        if (rightInfo != null && !rightInfo.isBST) {
            isBST = false;
        }
        boolean leftMaxLessRoot = leftInfo == null || (leftInfo.max < root.val);
        boolean rightMinMoreRoot = rightInfo == null || (rightInfo.min > root.val);
        if (!(leftMaxLessRoot && rightMinMoreRoot)) {
            isBST = false;
        }
        return new Info(isBST, max, min);
    }

    public boolean isValidBST(TreeNode root) {
        return process(root).isBST;
    }
}
