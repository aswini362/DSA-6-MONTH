package dsa.LeetCode.Arrays;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumberArrays(arr));

    }

    public static int missingNumberArrays(int[] nums) {
        int n = nums.length;
        int accutalSum = 0;
        int execptedSum = n * (n + 1) / 2;
        for (int num : nums) {
            accutalSum += num;
        }
        return execptedSum - accutalSum;
    }
}
