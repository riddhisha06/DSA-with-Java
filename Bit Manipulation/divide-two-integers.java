public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int result = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            int multiple = 1;

            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            result += multiple;
        }
        if ((dividend < 0) ^ (divisor < 0)) {
            result = -result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int dividend1 = 10, divisor1 = 3;
        System.out.println("Result: " + obj.divide(dividend1, divisor1));

        int dividend2 = 7, divisor2 = -3;
        System.out.println("Result: " + obj.divide(dividend2, divisor2));
    }
}
