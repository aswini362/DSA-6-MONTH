package dsa.LeetCode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {

    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > n / 2) {
                return num;
            }


        }

        return -1;
    }
    public static int majorityElementVoting(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

}
