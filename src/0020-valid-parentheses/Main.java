import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author yuanweimin(aszed)
 * @title valid-parentheses
 * @id #0020
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
        for (Character ele : s.toCharArray()) {
            if (stack.size() == 0) {
                stack.push(ele);
            } else if (map.get(stack.peek()) == ele) {
                stack.pop();
            } else {
                stack.push(ele);
            }
        }
        return stack.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "()[]{}";
        System.out.println(solution.isValid(str));
    }
}