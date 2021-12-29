package org.option.depthbreadth;

import java.util.LinkedList;

/**
 * @author Jun
 * @date 2021/12/29
 * @leetcode 617. Merge Two Binary Trees
 */
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        int value;
        while (root1 != null || root2 != null) {
            if (root1 != null && root2 != null) {
                value = root1.val + root2.val;
                TreeNode node = new TreeNode(value, mergeTrees(root1.left, root2.left), mergeTrees(root1.right, root2.right));
            } else if (root1 == null) {
                value = root2.val;
                TreeNode node = new TreeNode(value, mergeTrees(null, root2.left), mergeTrees(null, root2.right));
            } else {
                value = root1.val;
                TreeNode node = new TreeNode(value, mergeTrees(root1.left, null), mergeTrees(root1.right, null));
            }
        }
        return null;
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
