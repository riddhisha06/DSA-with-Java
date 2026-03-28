public class RomanToInteger {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";
        System.out.println(s1 + " -> " + sol.romanToInt(s1));
        System.out.println(s2 + " -> " + sol.romanToInt(s2));
        System.out.println(s3 + " -> " + sol.romanToInt(s3));
    }
}

class Solution {
    public int romanToInt(String s) {
        int ans = 0, prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = get(s.charAt(i));
            if (curr < prev) {
                ans -= curr;
            } else {
                ans += curr;
            }
            prev = curr;
        }
        return ans;
    }

    int get(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            default: return 1000; // 'M'
        }
    }
}
