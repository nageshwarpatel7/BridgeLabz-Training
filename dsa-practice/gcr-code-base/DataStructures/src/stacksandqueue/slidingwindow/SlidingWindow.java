package stacksandqueue.slidingwindow;

import java.util.Arrays;

public class SlidingWindow {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;
        
        MyDeque deque = new MyDeque();

        for (int i = 0; i < n; i++) {
            // 1. Remove indices that are out of this window range
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.removeFirst();
            }

            // 2. Remove indices of all elements smaller than current element
            // (Maintaining monotonic decreasing order)
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.removeLast();
            }

            // 3. Add current element index
            deque.addLast(i);

            // 4. Add the maximum (at the front) to our result
            if (i >= k - 1) {
                result[ri++] = nums[deque.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] output = maxSlidingWindow(nums, k);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Window Size: " + k);
        System.out.println("Result: " + Arrays.toString(output));
    }
}