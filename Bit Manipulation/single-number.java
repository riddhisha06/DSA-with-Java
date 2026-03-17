class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Output 1: " + sol.singleNumber(nums1)); // 1
        System.out.println("Output 2: " + sol.singleNumber(nums2)); // 4
    }
}
