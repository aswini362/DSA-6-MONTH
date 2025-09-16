package Basic.LeetCode.Arrays;

public class RotateArrayRightKSteps {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        roatedArrays(nums, k);
        for (int num : nums) {
            System.out.print(" " + num);
        }

    }

    //approached one
    public static void rotatedArrays(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            rotated[newIndex] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
    }

    // approached 2
    public static void roatedArrays(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
