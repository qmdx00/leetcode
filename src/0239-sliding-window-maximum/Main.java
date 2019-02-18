import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author yuanweimin(aszed)
 * @title sliding-window-maximum
 * @id #0239
 */

 /*
class Solution {
    PriorityQueue<Integer> window;
    Queue<Integer> queue = new LinkedList<>();
    ArrayList<Integer> res = new ArrayList<>();

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];

        window = new PriorityQueue<>(k, (x, y) -> y - x);
        for (int ele : nums) {
            slide(ele, k);
        }

        int[] arr = new int[res.size()];
        for (int i=0;i<res.size();i++) {
            arr[i] = res.get(i);
        }

        return arr;
    }

    public void slide(int val, int k) {
        if (queue.size() < k) {
            queue.offer(val);
        } else {
            queue.offer(val);
            queue.poll();
        }
        if (queue.size() == k) {
            window.addAll(queue);
            res.add(window.peek());
            window.clear();
        }
    }
}
*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> win = new LinkedList<>();
        int count = 0;
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            if (i >= k && win.peekLast() <= i - k) {
                win.pollLast();
            }
            while (!win.isEmpty() && nums[win.peekFirst()] <= nums[i]) {
                win.pollFirst();
            }
            win.offerFirst(i);
            if (i >= k - 1)
                res[count++] = nums[win.peekLast()];
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = solution.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(res));
    }
}