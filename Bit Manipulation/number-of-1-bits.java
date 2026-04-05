import java.util.*;
public class Main {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int result = hammingWeight(n);
        System.out.println("Number of 1 bits: " + result);
        sc.close();
    }
}
