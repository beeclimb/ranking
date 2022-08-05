package github.beeclimb.binarytree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jun.ma
 * @date 2022/8/5 9:05
 * @leetcode 113. Path Sum II
 */
public class PathSumII_113 {

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

    public List<Integer> copy(List<Integer> source) {
        List<Integer> target = new LinkedList<>();
        for (Integer i : source) {
            target.add(i);
        }
        return target;
    }

    public void process(TreeNode root, List<Integer> list, int preSum, int targetSum, List<List<Integer>> ans) {
        // 叶子节点
        if (root.left == null && root.right == null) {
            if (preSum + root.val == targetSum) {
                list.add(root.val);
                ans.add(copy(list));
                list.remove(list.size() - 1);
            }
            return;
        }
        preSum += root.val;
        list.add(root.val);
        // 非叶子节点
        if (root.left != null) {
            process(root.left, list, preSum, targetSum, ans);
        }
        if (root.right != null) {
            process(root.right, list, preSum, targetSum, ans);
        }
        list.remove(list.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        List<Integer> list = new LinkedList<>();
        process(root, list, 0, targetSum, ans);
        return ans;
    }
}
