class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1;
        long high = num;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num1 = 16;
        int num2 = 14;
        System.out.println("Is " + num1 + " a perfect square? " + sol.isPerfectSquare(num1));
        System.out.println("Is " + num2 + " a perfect square? " + sol.isPerfectSquare(num2));
    }
}
