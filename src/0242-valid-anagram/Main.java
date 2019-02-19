import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yuanweimin(aszed)
 * @title valid-anagram
 * @id #0242
 */

/*
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return new String(s1).equals(new String(t1));
    }
}
*/

/*
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sm = new HashMap();
        Map<Character, Integer> tm = new HashMap();
        for (Character ch : s.toCharArray()) {
            if (sm.get(ch) == null) {
                sm.put(ch, 1);
            } else {
                sm.put(ch, sm.get(ch) + 1);
            }
        }
        for (Character ch : t.toCharArray()) {
            if (tm.get(ch) == null) {
                tm.put(ch, 1);
            } else {
                tm.put(ch, tm.get(ch) + 1);
            }
        }
        return sm.equals(tm);
    }
}
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        
        final int INIT_SIZE = 26;
        int[] sa = new int[INIT_SIZE];
        int[] ta = new int[INIT_SIZE];
        
        for (int i = 0; i < s.length(); i++) {
            sa[s.charAt(i) - 'a']++;
            ta[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < INIT_SIZE; i++)
            if (sa[i] != ta[i]) return false;
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(solution.isAnagram(s, t));
    }
}