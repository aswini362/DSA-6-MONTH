package dsa.LeetCode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(hashMapSubArraysLength(arr, k));

    }

    public static int longestSubArraysLength(int[] nums, int k) {
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    int subLength = j - i + 1;
                    res = Math.max(res, subLength);
                }
            }

        }
        return res;
    }

    public static int hashMapSubArraysLength(int[] arr, int k) {
        int sum = 0, maxLength = 0;
        Map<Integer, Integer> perfixSum = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLength = i + 1;
            }
            if (perfixSum.containsKey(sum - k)) {
                int prevIndex = perfixSum.get(sum - k);
                maxLength = Math.max(maxLength, prevIndex);
            }
            perfixSum.putIfAbsent(sum, i);
        }

        return maxLength;

    }
}
