package dsa.LeetCode.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] nums1 = {1, 2, 3,};
        System.out.println(checkDuplicates(nums));
        System.out.println(checkDuplicates(nums1));

    }

    public static boolean checkDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
