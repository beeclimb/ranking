package github.beeclimb.binarytree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jun.ma
 * @date 2022/8/1 9:44
 * @leetcode 105. Construct Binary Tree from Preorder and Inorder Traversal
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal_105 {

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

    public TreeNode buildTree1(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length != in.length) {
            return null;
        }
        return f1(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public TreeNode f1(int[] pre, int L1, int R1, int[] in, int L2, int R2) {
        if (L1 > R1) {
            return null;
        }
        TreeNode head = new TreeNode(pre[L1]);
        if (L1 == R1) {
            return head;
        }
        int find = L2;
        while (in[find] != pre[L1]) {
            ++find;
        }
        head.left = f1(pre, L1 + 1, L1 + find - L2, in, L2, find - 1);
        head.right = f1(pre, L1 + find - L2 + 1, R1, in, find + 1, R2);
        return head;
    }

    /**
     * buildTree1，在in中找pre[L1]时，用的遍历
     * 在 buildTree1 的基础上， 用map存放in的值和索引，加快查询效率
     */
    public TreeNode buildTree2(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length != in.length) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>(in.length);
        for (int i = 0; i < in.length; ++i) {
            map.put(in[i], i);
        }
        return f2(pre, 0, pre.length - 1, in, 0, in.length - 1, map);
    }

    public TreeNode f2(int[] pre, int L1, int R1, int[] in, int L2, int R2, Map map) {
        if (L1 > R1) {
            return null;
        }
        TreeNode head = new TreeNode(pre[L1]);
        if (L1 == R1) {
            return head;
        }
        int find = (int) map.get(pre[L1]);
        head.left = f2(pre, L1 + 1, L1 + find - L2, in, L2, find - 1, map);
        head.right = f2(pre, L1 + find - L2 + 1, R1, in, find + 1, R2, map);
        return head;
    }

}
