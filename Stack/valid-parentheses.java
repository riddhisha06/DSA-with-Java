import java.util.*;
public class Main {
    static class Solution {
        public boolean isValid(String s) {
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for (char ch : s.toCharArray()) {
                if (ch == '(') stack.push(')');
                else if (ch == '{') stack.push('}');
                else if (ch == '[') stack.push(']');
                else {
                    if (stack.isEmpty() || stack.pop() != ch) return false;
                }
            }
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([])";
        String s5 = "([)]";

        System.out.println(obj.isValid(s1));
        System.out.println(obj.isValid(s2));
        System.out.println(obj.isValid(s3));
        System.out.println(obj.isValid(s4));
        System.out.println(obj.isValid(s5));
    }
}
