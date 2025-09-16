package Basic.LeetCode.Arrays;

public class CheckArraysIsSortedAndRotated {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int [] nums1={2,1,3,4};
        System.out.println(checkArraysSortedRotated(nums));
        System.out.println(checkArraysSortedRotated(nums1));
    }


    public static boolean checkArraysSortedRotated(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}
