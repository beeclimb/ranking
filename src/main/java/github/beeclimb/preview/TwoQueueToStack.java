package github.beeclimb.preview;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @date 2022/8/8 7:26
 */
public class TwoQueueToStack {

    public static class MyStack<T> {
        public Queue<T> queue;
        public Queue<T> help;

        public MyStack() {
            queue = new LinkedList<>();
            help = new LinkedList<>();
        }

        public void push(T value) {
            queue.offer(value);
        }

        public T poll() {
            while (queue.size() > 1) {
                help.offer(queue.poll());
            }
            T ans = queue.poll();
            Queue<T> tmp = queue;
            queue = help;
            help = tmp;
            return ans;
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }
    }
}
