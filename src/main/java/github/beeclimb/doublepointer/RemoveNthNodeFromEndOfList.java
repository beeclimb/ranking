package github.beeclimb.doublepointer;

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

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;

    }

}








