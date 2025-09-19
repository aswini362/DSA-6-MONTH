package dsa.LeetCode.Arrays.SubArrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithGivenSumK {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        int k = 10;
        System.out.println(betterSolution(arr, k));

    }

    public static int lengethOfTheArrays(int[] arr, int target) {
        int n = arr.length;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == target) {
                    int subLength = j - i + 1;
                    maxLength = Math.max(maxLength, subLength);
                }

            }


        }


        return maxLength;

    }
    // only if positive number

    public static int betterOnlyForPositiveNumber(int[] arr, int k) {
        int n = arr.length;
        int left = 0, sum = 0, maxlength = 0;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxlength = Math.max(maxlength, right - left + 1);
            }

        }
        return maxlength;

    }


    public static int betterSolution(int[] nums, int k) {
        int maxLength = 0;
        int n = nums.length;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }
            int subLength = sum - k;
            if (prefixSumMap.containsKey(subLength)) {
                int length = i - prefixSumMap.get(subLength);
                maxLength = Math.max(maxLength, length);
            }

            prefixSumMap.putIfAbsent(sum, i);


        }


        return maxLength;
    }
}
