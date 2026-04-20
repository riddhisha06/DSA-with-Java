public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        long num = n;
        return (int)((Math.sqrt(1 + 8 * num) - 1) / 2);
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 8;
        System.out.println("Input: " + n1 + " -> Output: " + arrangeCoins(n1));
        System.out.println("Input: " + n2 + " -> Output: " + arrangeCoins(n2));
    }
}
