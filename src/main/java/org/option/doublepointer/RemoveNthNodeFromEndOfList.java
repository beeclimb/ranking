package org.option.doublepointer;

/**
 * @author Jun
 * @date 2021/12/7
 * @leetcode 19. Remove Nth Node From End of List
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        int slowIndex = 1, fastIndex = 1;
        while (fast.next != null) {
            fast = fast.next;
            ++fastIndex;
            if (fastIndex - slowIndex == n + 1) {
                slow = slow.next;
                ++slowIndex;
            }
        }
        if (fastIndex == n) {
            return head.next;
        }
        if (slow.next == null) {
            return null;
        }
        slow.next = slow.next.next;
        return head;
    }
}
