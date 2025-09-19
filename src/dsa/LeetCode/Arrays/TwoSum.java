package dsa.LeetCode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] ints = twoSumWithHashMap(nums, target);

        System.out.println(Arrays.toString(ints));


    }

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{};
    }

    // if only sorted an arrays
    public static int[] twoSumWithTwoPointer(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum == target) {
                return new int[]{left, right};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    //both sorted and unsorted an Arrays

    public static int[] twoSumWithHashMap(int nums[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }


    public int[] twoSumIndexAdding(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                return new int[]{left + 1, right + 1}; // 1-indexed
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }


}
