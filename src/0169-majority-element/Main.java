import java.util.Arrays;

/**
 * @author yuanweimin(aszed)
 * @title majority-element
 * @id #0169
 */

/*
class Solution {
    public int majorityElement(int[] nums) {
        int result = nums[0], count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                result = nums[i];
                count++;
            } else if(result == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return result;
    }
}
*/

class Solution {
    public int majorityElement(int[] nums) {
    	Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = { 1, 2, 2, 4, 5, 3, 2 };
		System.out.println(solution.majorityElement(nums));
	}
}