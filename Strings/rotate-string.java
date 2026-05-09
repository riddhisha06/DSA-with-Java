import java.util.Scanner;
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.nextLine();
        System.out.print("Enter goal string: ");
        String goal = sc.nextLine();
        Solution obj = new Solution();
        boolean result = obj.rotateString(s, goal);
        System.out.println("Is Rotation Possible? " + result);
        sc.close();
    }
}
