import java.util.*;
class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        for (int i = 0; i < m; i++) {
            int empty = n - 1;
            for (int j = n - 1; j >= 0; j--) {
                if (boxGrid[i][j] == '*') {
                    empty = j - 1;
                } 
                else if (boxGrid[i][j] == '#') {
                    char temp = boxGrid[i][j];
                    boxGrid[i][j] = '.';
                    boxGrid[i][empty] = temp;
                    empty--;
                }
            }
        }
        char[][] result = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][m - 1 - i] = boxGrid[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] boxGrid = new char[m][n];
        for (int i = 0; i < m; i++) {
            String row = sc.next();
            boxGrid[i] = row.toCharArray();
        }
        Solution obj = new Solution();
        char[][] ans = obj.rotateTheBox(boxGrid);
        for (char[] row : ans) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
