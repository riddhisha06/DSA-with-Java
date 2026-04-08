import java.util.*;
class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                numSeen = true;
            } 
            else if (ch == '.') {
                if (dotSeen || eSeen) return false;
                dotSeen = true;
            } 
            else if (ch == 'e' || ch == 'E') {
                if (eSeen || !numSeen) return false;
                eSeen = true;
                numSeen = false;
            } 
            else if (ch == '+' || ch == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } 
            else {
                return false;
            }
        }
        return numSeen;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] tests = {
            "2", "0089", "-0.1", "+3.14", "4.", "-.9",
            "2e10", "-90E3", "3e+7", "+6e-1",
            "53.5e93", "-123.456e789",
            "abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"
        };
        for (String s : tests) {
            System.out.println(s + " -> " + sol.isNumber(s));
        }
    }
}
