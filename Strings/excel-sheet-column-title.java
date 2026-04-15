import java.util.*;
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;  
            int remainder = columnNumber % 26;
            char ch = (char) ('A' + remainder);
            result.append(ch);
            columnNumber = columnNumber / 26;
        }
        return result.reverse().toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter column number: ");
        int columnNumber = sc.nextInt();
        Solution obj = new Solution();
        String result = obj.convertToTitle(columnNumber);
        System.out.println("Excel Column Title: " + result);
        sc.close();
    }
}
