package dsa.LeetCode.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {

    public static void main(String[] args) {

    }

    public static List<Integer> majorityElement(int nums[]) {
        int n = nums.length;

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> results = new ArrayList<>();
        for (int key : countMap.keySet()) {
            if (countMap.get(key) > n / 3) {
                results.add(key);
            }
        }
        return results;
    }
}
