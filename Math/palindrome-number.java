class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int x1 = 121;
        int x2 = -121;
        System.out.println("Input: " + x1 + " → " + obj.isPalindrome(x1));
        System.out.println("Input: " + x2 + " → " + obj.isPalindrome(x2));
    }
}
