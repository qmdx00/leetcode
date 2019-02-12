/**
 * @author yuanweimin(aszed)
 * @title longest-substring-without-repeating-characters
 * @id #0003
 */

 /*
  * This method timeout 
  * O(n) = n^3
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int ans = 0;
        for(int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                if (!hasRepeat(s, i, j)) ans = Math.max(ans, j-i);
            }
        }
        return ans;
    }

    boolean hasRepeat(String s, int start, int end) {
        for(int i = start; i < end - 1; i++) {
            for (int j = i + 1; j < end; j++) {
                if(s.charAt(j) == s.charAt(i)) 
                    return true;
            }
        }
        return false;
    }
}
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        
        return len;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("wwpkew"));
    }
}