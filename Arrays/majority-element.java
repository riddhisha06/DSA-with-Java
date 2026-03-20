class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = sol.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
