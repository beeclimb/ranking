package github.beeclimb.preview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jun.ma
 * @date 2022/7/14 18:23:00
 */
public class LinkedList {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        System.out.println(getLinkedListOriginOrder(node1));
        Node reversedNode = reverseLinkedList(node1);
        System.out.println(getLinkedListOriginOrder(reversedNode));
    }


    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            value = data;
        }
    }

    public static Node reverseLinkedList(Node head) {
        Node next = null;
        Node pre = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static List<Integer> getLinkedListOriginOrder(Node head) {
        List<Integer> ans = new ArrayList<>();
        while (head != null) {
            ans.add(head.value);
            head = head.next;
        }
        return ans;
    }

}
