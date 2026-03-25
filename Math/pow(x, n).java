public class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1;
        while (N > 0) {
            if (N % 2 == 1) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.myPow(2.0, 10));
        System.out.println(obj.myPow(2.1, 3));
    }
}
