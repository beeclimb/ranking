package github.beeclimb.preview;

/**
 * @author jun.ma
 * @date 2022/8/6 17:58
 */
public class QuickSort {
    public void process(int[] arr, int L, int R) {
        if (L >= R) {
            return;
        }
        int lessR = L - 1;
        int moreL = R;
        int cur = L;
        while (cur < moreL) {
            // < 区间
            if (arr[cur] < arr[R]) {
                swap(arr, cur++, ++lessR);
                // > 区间
            } else if (arr[cur] > arr[R]) {
                swap(arr, cur, --moreL);
                // = 区间
            } else {
                ++cur;
            }
        }
        swap(arr, R, moreL);
        process(arr, L, lessR);
        process(arr, cur + 1, R);
    }

    // for test
    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }


}
