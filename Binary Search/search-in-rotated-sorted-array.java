class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
      
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;

        int[] nums2 = {4,5,6,7,0,1,2};
        int target2 = 3;

        System.out.println("Output 1: " + sol.search(nums1, target1));
        System.out.println("Output 2: " + sol.search(nums2, target2));
    }
}
