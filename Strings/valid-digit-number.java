import java.util.*;
class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        String digit = String.valueOf(x);
        if (s.contains(digit) && s.charAt(0) != digit.charAt(0)) {
            return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        Solution obj = new Solution();
        boolean result = obj.validDigit(n, x);
        System.out.println(result);
        sc.close();
    }
}
