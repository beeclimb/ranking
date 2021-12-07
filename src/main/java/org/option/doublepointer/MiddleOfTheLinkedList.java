package org.option.doublepointer;

/**
 * @author Jun
 * @date 2021/12/7
 * @leetcode 876. Middle of the Linked List
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        int nodeCounts = 1;
        while (fast.next != null) {
            fast = fast.next;
            if (nodeCounts % 2)

        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}