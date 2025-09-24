package dsa.LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementsBySign {

    public static void main(String[] args) {

    }

    public static int[] rearrangeArray(int[] nums) {
        int[] results = new int[nums.length];
        List<Integer> posIndex = new ArrayList<>();
        List<Integer> negIndex = new ArrayList<>();
        for (int num : nums) {
            if (num >= 0) {
                posIndex.add(num);
            } else {
                negIndex.add(num);
            }

        }

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < posIndex.size() && j < negIndex.size()) {
            results[k++] = posIndex.get(i++);
            results[k++] = negIndex.get(j++);
        }

        return results;
    }

    public static int[] rearrangeArraySign(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];
        int postiveIndex = 0;
        int negativeIndex = 1;
        for (int num : nums) {
            if (num > 0) {
                results[postiveIndex] = num;
                postiveIndex += 2;
            } else {
                results[negativeIndex] = num;
                negativeIndex += 2;
            }

        }

        return results;
    }
}
