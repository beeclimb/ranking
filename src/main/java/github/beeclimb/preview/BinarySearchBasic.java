package github.beeclimb.preview;

/**
 * @author jun.ma
 * @date 2022/7/13 16:27:00
 */
public class BinarySearchBasic {

    /**
     * 前提条件：arr有序
     * 搜索arr中有没有num
     */
    public static boolean binarySearchExist(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    /**
     * arr有序, 找 >= num 最左边的数
     */
    public static int nearLeft(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] >= num) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    /**
     * arr无序且相邻的数不相等，找出一个局部最小值，找到一个就可以了
     * 局部最小值：1. 最左边   2.最右边   3.中间
     */
    public static int minIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int n = arr.length;
        if (n == 1) {
            return 0;
        }
        // 出现在最左边
        if (arr[0] < arr[1]) {
            return 0;
        }
        // 出现在最右边
        if (arr[n - 2] > arr[n - 1]) {
            return n - 1;
        }
        // 走到这里，说明最左边是arr[0]>arr[1]，最左边下降趋势
        // 最右边arr[n-1] > arr[n-2]，最右边上升趋势
        // 中间一定有num满足：num小于两边的数，num就是局部最小值
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            // mid位置的数比两边都小
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                return mid;
            } else {
                // mid大于前面的数
                if (arr[mid] > arr[mid - 1]) {
                    r = mid;
                } else {
                    l = mid;
                }
            }
        }
        return -1;
    }

}
