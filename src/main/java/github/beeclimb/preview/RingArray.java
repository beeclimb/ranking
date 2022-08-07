package github.beeclimb.preview;

/**
 * @date 2022/8/7 21:10
 */
public class RingArray {

    public static class MyQueue {
        private int[] arr;
        private int pushIndex;
        private int pollIndex;
        private int size;
        private final int limit;

        public MyQueue(int limit) {
            arr = new int[limit];
            pushIndex = 0;
            pollIndex = 0;
            size = 0;
            this.limit = limit;
        }

        public void push(int value) {
            if (size == limit) {
                throw new RuntimeException("queue is full");
            }
            arr[pushIndex] = value;
            ++size;
            pushIndex = nextIndex(pushIndex);
        }

        public int pop() {
            if (size == 0) {
                throw new RuntimeException("queue is empty");
            }
            int ans = arr[pollIndex];
            --size;
            pollIndex = nextIndex(pollIndex);
            return ans;
        }

        public int nextIndex(int i) {
            return i < limit - 1 ? i + 1 : 0;
        }
    }
}
