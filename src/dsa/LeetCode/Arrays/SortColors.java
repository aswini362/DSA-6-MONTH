package dsa.LeetCode.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColor(nums);
        for (int num : nums) {
            System.out.print(" " + num);
        }

    }

    public static void sortColor(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low++, mid++);
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high--);
            }
        }

    }

    public static void swap(int nums[], int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

    }

    public static void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;


        for (int num : nums) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

        // Overwrite array with sorted order
        int index = 0;

        // Fill 0s
        while (count0-- > 0) {
            nums[index++] = 0;
        }
        // Fill 1s
        while (count1-- > 0) {
            nums[index++] = 1;
        }
        // Fill 2s
        while (count2-- > 0) {
            nums[index++] = 2;
        }
    }

}
