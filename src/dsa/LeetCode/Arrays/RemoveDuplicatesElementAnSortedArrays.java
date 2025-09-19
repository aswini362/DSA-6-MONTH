package dsa.LeetCode.Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesElementAnSortedArrays {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3};
        int remove = twoPointer(nums);
        for (int i = 0; i < remove; i++) {
            System.out.print(" " + nums[i]);
        }
    }

    public static int removeDuplicatesElement(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int i = 0;
        for (int val : set) {
            nums[i++] = val;
        }
        return set.size();
    }

    public static int twoPointer(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
