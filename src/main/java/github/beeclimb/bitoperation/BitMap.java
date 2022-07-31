package github.beeclimb.bitoperation;

import java.util.HashSet;

/**
 * @author jun.ma
 * @date 2022/7/31 15:43
 */
public class BitMap {

    /**
     * Long -> 8 byte -> 64 bit
     * [0]: 63 ~ 0;     [1]: 64 ~ 127;      [2]: 128 ~ 191
     */
    private long[] bits;

    /**
     * 根据max确定需要多大的Long数组
     */
    public BitMap(int max) {
        // 确定需要多大的数组：(max / 64) + 1 => (max >> 6) + 1
        bits = new long[(max >> 6) + 1];
    }

    /**
     * 添加num到bitmap，让代表num这一位变为1
     */
    public void add(int num) {
        // 1. 确定num在数组的哪个桶， num / 64
        // 2. 确定num在桶的具体哪一位， num % 64
        // 3. 将bitmap的这一位置为1
        bits[num >> 6] |= (1L << (num & 63));
    }

    /**
     * 从bitmap删除num
     */
    public void delete(int num) {
        // 1. 确定num在哪个桶
        // 2. 确定num在桶的第几位
        // 3. 将bitmap这一位的值改为0，1L左移到目标位置，取反，再与上桶
        bits[num >> 6] &= ~(1L << (num & 63));
    }

    public boolean contains(int num) {
        return (bits[num >> 6] & (1L << (num & 63))) != 0;
    }

    public static void main(String[] args) {
        System.out.println("测试开始！");
        int max = 10000;
        BitMap bitMap = new BitMap(max);
        HashSet<Integer> set = new HashSet<>();
        int testTime = 10000000;
        for (int i = 0; i < testTime; i++) {
            int num = (int) (Math.random() * (max + 1));
            double decide = Math.random();
            if (decide < 0.333) {
                bitMap.add(num);
                set.add(num);
            } else if (decide < 0.666) {
                bitMap.delete(num);
                set.remove(num);
            } else {
                if (bitMap.contains(num) != set.contains(num)) {
                    System.out.println("Oops!");
                    break;
                }
            }
        }
        for (int num = 0; num <= max; num++) {
            if (bitMap.contains(num) != set.contains(num)) {
                System.out.println("Oops!");
            }
        }
        System.out.println("测试结束！");
    }


}
