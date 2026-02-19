public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int length = nums.length;
        while (i < length) {
            if (nums[i] == val) {
                nums[i] = nums[length - 1];
                length--;
            } else {
                i++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int k = removeElement(nums, val);
        System.out.print("Output = " + k + ", nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
    }
}
