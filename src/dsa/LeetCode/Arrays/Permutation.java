package dsa.LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permute = permute(nums);
        for (List<Integer> list : permute) {
            System.out.println(list);
        }

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
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
        for (int i = index; i < nums.length; i++) {
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
