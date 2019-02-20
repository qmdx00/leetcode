/**
 * @author yuanweimin(aszed)
 * @title jewels-and-stones
 * @id #0771
 */

class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] a = J.toCharArray();
        char[] b = S.toCharArray();
        for(char ele:a) {
            for(char s:b) {
                if(s == ele) {
                    count++;
                }
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numJewelsInStones("aA", "aAAbbbb"));
    }
}