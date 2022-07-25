package github.beeclimb.preview;

/**
 * @author jun.ma
 * @date 2022/7/25 8:42:00
 */
public class LinkedListToQueueAndStack {
    public static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E e) {
            value = e;
            next = null;
        }
    }

    public static class MyQueue<E> {
        private Node<E> head;
        private Node<E> tail;
        private int size;

        public MyQueue() {
            head = null;
            tail = null;
            size = 0;
        }

        public boolean inEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void offer(E value) {
            Node<E> cur = new Node<>(value);
            if (head == null) {
                head = cur;
                tail = cur;
            } else {
                tail.next = cur;
                tail = cur;
            }
            ++size;
        }

        public E poll() {
            E ans = null;
            if (head != null) {
                ans = head.value;
                head = head.next;
                --size;
            } else {
                tail = null;
            }
            return ans;
        }

        public E peek() {
            E ans = null;
            if (head != null) {
                ans = head.value;
            }
            return ans;
        }
    }

    public static class MyStack<E> {
        private Node<E> head;
        private int size;

        public MyStack() {
            head = null;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void push(E value) {
            Node<E> cur = new Node<>(value);
            if (head == null) {
                head = cur;
            } else {
                cur.next = head;
                head = cur;
            }
            ++size;
        }

        public E pop() {
            E ans = null;
            if (head != null) {
                ans = head.value;
                head = head.next;
                --size;
            }
            return ans;
        }

        public E peek() {
            return head == null ? null : head.value;
        }
    }
}