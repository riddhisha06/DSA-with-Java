class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println("Output 1: " + sol.strStr(haystack, needle));
    }
}
