package github.beeclimb.preview;

import java.util.Stack;

/**
 * @date 2022/8/7 22:58
 */
public class TwoStackToQueue {

    public static class MyQueue {
        public Stack<Integer> pushStack;
        public Stack<Integer> popStack;

        public MyQueue() {
            pushStack = new Stack<>();
            popStack = new Stack<>();
        }

        // push栈向pop栈倒入数据
        // 倒入数据前必须满足两个条件
        // 1. pop stack 为空
        // 2. push stack 一次性倒完
        private void pushToPop() {
            if (popStack.empty()) {
                while (!pushStack.empty()) {
                    popStack.push(pushStack.pop());
                }
            }
        }

        public void add(int num) {
            pushStack.push(num);
            pushToPop();
        }

        public int poll() {
            if (popStack.empty() && pushStack.empty()) {
                throw new RuntimeException("queue is empty");
            }
            pushToPop();
            return popStack.pop();
        }

        public int peek() {
            if (popStack.empty() && pushStack.empty()) {
                throw new RuntimeException("queue is empty");
            }
            pushToPop();
            return popStack.peek();
        }
    }

    public static void main(String[] args) {
        MyQueue test = new MyQueue();
        test.add(1);
        test.add(2);
        test.add(3);
        System.out.println(test.peek());
        System.out.println(test.poll());
        System.out.println(test.peek());
        System.out.println(test.poll());
        System.out.println(test.peek());
        System.out.println(test.poll());
    }
}
