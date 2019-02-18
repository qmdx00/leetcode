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

    List<Integer> res = new LinkedList<>();
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int count = 0;
        for (int ele : nums)
            adjust(deque, ele, k, count++);
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }

    public void adjust(Deque deque, int val, int k, int count) {
        if (deque.size() == 0) {
            deque.offerFirst(val);
        } else if (deque.size() > k) {
            deque.pollLast();
            deque.offerFirst(val);
        } else if ((int)deque.peekFirst() >= val) {
            deque.offerFirst(val);
        } else if ((int)deque.peekFirst() < val) {
            while (!deque.isEmpty()) {
                if ((int)deque.peekFirst() < val) {
                    deque.pollFirst();
                } else break;
            }
            deque.offerFirst(val);
        }
        
        if (count >= k - 1)
            res.add((int)deque.peekLast());
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