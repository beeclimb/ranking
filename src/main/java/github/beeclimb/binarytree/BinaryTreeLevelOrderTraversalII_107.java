package github.beeclimb.binarytree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author jun.ma
 * @date 2022/8/2 22:50
 * @leetcode 107. Binary Tree Level Order Traversal II
 */
public class BinaryTreeLevelOrderTraversalII_107 {

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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> curAns = new LinkedList<>();
            for (int i = 0; i < size; ++i) {
                TreeNode curNode = queue.poll();
                curAns.add(curNode.val);
                if (curNode.left != null) {
                    queue.add(curNode.left);
                }
                if (curNode.right != null) {
                    queue.add(curNode.right);
                }
            }
            ans.addFirst(curAns);
        }
        return ans;
    }

}
