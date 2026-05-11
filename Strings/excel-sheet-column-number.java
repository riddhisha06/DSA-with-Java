class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        String s1 = "A";
        String s2 = "AB";
        String s3 = "ZY";
        System.out.println(obj.titleToNumber(s1)); System.out.println(obj.titleToNumber(s2)); System.out.println(obj.titleToNumber(s3));
    }
}