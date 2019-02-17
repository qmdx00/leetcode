import java.util.PriorityQueue;

/**
 * @author yuanweimin(aszed)
 * @title kth-largest-element-in-a-stream
 * @id #0703
 */

class KthLargest {
    final PriorityQueue<Integer> queue;
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for (int num : nums)
            add(num);
    }
    
    public int add(int val) {
        if (queue.size() < k)
            queue.offer(val);
        else if (queue.peek() < val) {
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 2, 8, 2};
        KthLargest kth = new KthLargest(3, nums);

        System.out.println(kth.queue.toString());
        System.out.println("add 1, the " + kth.k + "th num is :" + kth.add(1));
        System.out.println(kth.queue.toString());
        System.out.println("add 3, the " + kth.k + "th num is :" + kth.add(3));
        System.out.println(kth.queue.toString());
    }
}