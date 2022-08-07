package github.beeclimb.preview;

import java.util.Stack;

/**
 * @date 2022/8/7 21:54
 */
public class GetMinStack {

    public static class MyStack1 {
        private Stack<Integer> dataStack;
        private Stack<Integer> minStack;

        public MyStack1() {
            this.dataStack = new Stack<>();
            this.minStack = new Stack<>();
        }

        public void push(int num) {
            if (this.minStack.isEmpty()) {
                this.minStack.push(num);
            } else if (num <= this.minStack.peek()) {
                minStack.push(num);
            }
            this.dataStack.push(num);
        }

        public Integer pop() {
            if (dataStack.isEmpty()) {
                throw new RuntimeException("stack is empty");
            }
            int ans = dataStack.pop();
            if (ans == this.getmin()) {
                minStack.pop();
            }
            return ans;
        }

        public Integer getmin() {
            if (this.minStack.isEmpty()) {
                throw new RuntimeException("stack is empty");
            }
            return this.minStack.peek();
        }
    }

    public static class MyStack2 {
        private Stack<Integer> dataStack;
        private Stack<Integer> minStack;

        public MyStack2() {
            dataStack = new Stack<Integer>();
            minStack = new Stack<Integer>();
        }

        public void push(int num) {
            if (minStack.isEmpty()) {
                minStack.push(num);
            } else if (num < minStack.peek()) {
                minStack.push(num);
            } else {
                minStack.push(minStack.peek());
            }
            dataStack.push(num);
        }

        public Integer pop() {
            if (dataStack.isEmpty()) {
                throw new RuntimeException("stack is empty");
            }
            minStack.pop();
            return dataStack.pop();
        }

        public Integer getmin() {
            if (this.minStack.isEmpty()) {
                throw new RuntimeException("stack is empty");
            }
            return this.minStack.peek();
        }
    }

    public static void main(String[] args) {
        MyStack1 stack1 = new MyStack1();
        stack1.push(3);
        System.out.println(stack1.getmin());
        stack1.push(4);
        System.out.println(stack1.getmin());
        stack1.push(1);
        System.out.println(stack1.getmin());
        System.out.println(stack1.pop());
        System.out.println(stack1.getmin());

        System.out.println("=============");

        MyStack2 stack2 = new MyStack2();
        stack2.push(3);
        System.out.println(stack2.getmin());
        stack2.push(4);
        System.out.println(stack2.getmin());
        stack2.push(1);
        System.out.println(stack2.getmin());
        System.out.println(stack2.pop());
        System.out.println(stack2.getmin());
    }
}
