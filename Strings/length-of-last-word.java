class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (count > 0) {
                    return count;
                }
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        System.out.println(obj.lengthOfLastWord(s1));
        System.out.println(obj.lengthOfLastWord(s2));
    }
}
