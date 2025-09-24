package dsa.LeetCode.Arrays;

import java.util.*;

public class PermutationUniqueElement {

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        List<List<Integer>> permute = permuteUnique(nums);
        for (List<Integer> list : permute) {
            System.out.println(list);
        }

    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(nums, 0, results);
        return results;

    }

    public static void backtracking(int[] nums, int index, List<List<Integer>> results) {
        if (index == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            results.add(permutation);
            return;
        }
        Set<Integer> seen = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if (seen.contains(nums[i])) continue; // skip duplicates
            seen.add(nums[i]);
            swap(nums, index, i);
            backtracking(nums, index + 1, results);
            swap(nums, index, i);
        }

    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
