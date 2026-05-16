public class Main {
    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxA = 0;
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            int area = h * (r - l);
            maxA = Math.max(maxA, area);
            if (height[r] > height[l]) {
                l++;
            } else {
                r--;
            }
        }
        return maxA;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum Area = " + maxArea(height));
    }
}
